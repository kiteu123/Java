$(function () {
    var slider = $('.bxslider').bxSlider({
        auto: true,
    });

    $('.slider-basic').slick({
        autoplay: true,
        dots: true,
        arrows: false,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1
    });

    const $ham = $('.hamburger');
    const $nav = $('.mobile_nav');
    const $bg = $('.mobile_bg');
    const $body = $('body');


    // 햄버거 클릭
    $ham.click(function () {

        $(this).toggleClass('active');
        $nav.toggleClass('active');
        $bg.toggleClass('active');

        // 스크롤 잠금
        $body.toggleClass('hidden');

    });


    // 배경 클릭 → 닫기
    $bg.click(function () {

        closeMenu();

    });


    // 메뉴 닫기 함수
    function closeMenu() {

        $ham.removeClass('active');
        $nav.removeClass('active');
        $bg.removeClass('active');
        $body.removeClass('hidden');

    }

    $('.mobile_gnb > li > a').click(function (e) {

        e.preventDefault(); // 링크 막기

        $(this).next('ul').slideToggle();
        $(this).parent().siblings().find('ul').slideUp();

    });
});