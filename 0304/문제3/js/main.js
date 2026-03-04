$(function () {

    const $dts = $('dt');
    const $dds = $('dd');

    $dts.click(function () {

        const index = $(this).index('dt');
        const $targetDd = $dds.eq(index);
        const isOpen = $targetDd.hasClass('active');

        // 전부 초기화
        $dts.removeClass('selected');
        $dds.removeClass('active');

        // 열려있지 않으면 열기
        if (!isOpen) {
            $(this).addClass('selected');
            $targetDd.addClass('active');
        }

    });

});