$(function () {
    $(window).scroll(function () {

        var sct = $(this).scrollTop();
        $('.s_Top').text(sct);

        if (sct >= 450 && sct < 1000) {
            $('.left1').addClass('on');
        } else {
            $('.left1').removeClass('on');
        }

        if (sct >= 1000 && sct <= 1800) {
            $('.right1').addClass('on');
        } else {
            $('.right1').removeClass('on');
        }

        if (sct >= 2500) {
            $('.s4_1').addClass('active');

            setTimeout(function () {
                $('.s4_2').addClass('active');
            }, 400);

            setTimeout(function () {
                $('.s4_3').addClass('active');
            }, 800);

            setTimeout(function () {
                $('.s4_4').addClass('active');
            }, 1200);
        }
        $('.container>div').each(function (index) {
            if (sct >= $(this).offset().top) {
                $('nav ul li').removeClass('on').eq(index).addClass('on');
            }
        });
    });



    $('nav ul li').click(function () {

        var i = $(this).index();
        var offset_t = $('.container > div').eq(i).offset().top;

        $('html, body').stop().animate({
            scrollTop: offset_t
        }, 1000);
        return false;
    });

    $('.container>div').mousewheel(function (event, d) {
        console.log(d);
        if (d > 0) {
            let preVal = $(this).prev().offset().top;
            $('html,css').stop().animate({ scrollTop: preVal }, 1000, 'easeOutBounce');
        }
        if (d < 0) {
            let nextVal = $(this).next().offset().top;
            $('html,css').stop().animate({ scrollTop: nextVal }, 1000, 'easeOutBounce');
        }
    });

    $('#popup').draggable();
    if ($.cookie('pop') != 'no') {
        $('#popup').show();
    }

    $('#popup area:eq(0)').click(function () {
        $('#popup').fadeOut('fast');
    });

    $('#popup area:eq(1)').click(function () {
        $.cookie('pop', 'no', { expires: 1 });
        $('#popup').fadeOut('fast');
    })

    $('#notice_wrap').draggable();
    if ($.cookie('popup') == 'none') {
        $('#notice_wrap').hide();
    }

    let chk = $('#expiresChk');
    $('.closeBtn').on('click', closePop);

    function closePop() {
        if (chk.is(':checked')) {
            $.cookie('popup', 'none', { expires: 3 });
        }
        $('#notice_wrap').fadeOut();
    }
});