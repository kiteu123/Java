package a0212.hotel;

import java.io.*;

public class ReservationTicket {

    private ReservationManager manager;

    public ReservationTicket(ReservationManager manager) {
        this.manager = manager;
    }

    public void updateHotelList() {

        File file = new File("c:\\hotelReservation\\hotelList.txt");

        if (!file.exists()) {
            System.out.println("hotelList.txt 파일이 없습니다.");
            return;
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), "UTF-8"))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.trim();

                if (line.isEmpty())
                    continue;

                String[] data = line.split("/");

                if (data.length != 4) {
                    System.out.println("잘못된 형식: " + line);
                    continue;
                }

                try {
                    String name = data[0];
                    String location = data[1];
                    int price = Integer.parseInt(data[2]);
                    int roomCount = Integer.parseInt(data[3]);

                    Hotel hotel = new Hotel(name, location, price, roomCount);

                    manager.addHotel(hotel);

                } catch (NumberFormatException e) {
                    System.out.println("숫자 오류: " + line);
                }
            }

            System.out.println("호텔 목록 로딩 완료");

        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }

    public void printTicket(int num) {

        try {

            File dir = new File("c:\\hotelReservation");

            if (!dir.exists()) {
                dir.mkdir();
            }

            File file = new File(dir, "ticket_" + num + ".txt");

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(file), "UTF-8"));

            String data = manager.getReservationDetails(num);

            if (data == null) {
                System.out.println("예약 정보 없음");
                bw.close();
                return;
            }

            bw.write(data);

            bw.close();

            System.out.println("티켓 생성 완료");

        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}
