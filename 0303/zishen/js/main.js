$(function () {
  $(window).resize(function () {
    var w = $(this).width();

    if (w <= 850) {
    } else {
      if ($(".mobile_nav").hasClass("active")) {
        $(".mobile_nav").removeClass("active");
        $(".transparency").removeClass("active");
        $(".container").removeClass("active");
        $(".mobile_nav .sub").css("display", "none");
      }
    }
  });

  $(window).trigger("resize");
  //컴퓨터가 브라우저 켜자마자 한번 resize 명령을 실행

  $(".nav ul").hover(
    function () {
      $(this).addClass("over");
    },
    function () {
      $(this).removeClass("over");
    }
  );

  $(".mobile_tab").click(function () {
    $(".mobile_nav").addClass("active");
    $(".transparency").addClass("active");
    $(".container").addClass("active");
  });

  $(".transparency").click(function () {
    $(".mobile_nav").removeClass("active");
    $(".transparency").removeClass("active");
    $(".container").removeClass("active");
    $(".mobile_nav .sub").css("display", "none");
    return false;
  });

  $(".mobile_nav > ul > li >a").click(function () {
    var k = $(this).next(".sub").css("display");
    // alert(k);
    if (k == "none") {
      $(".mobile_nav .sub").slideUp(300);
      $(this).next(".sub").slideDown(300);
    } else {
      $(this).next(".sub").slideUp(300);
    }

    return false;
  });

  $('.item').css({
    'opacity': '0',
    'transform': 'translateY(30px)',
    'transition': 'opacity 0.6s ease, transform 0.6s ease'
  });
  $('.item').each(function (index) {
    $(this).css('transition-delay', (index + 0.1) + 's')
  });

  $(window).on('scroll resize', function () {
    $('.item').each(function () {
      var elementTop = $(this).offset().top;
      var elementBottom = elementTop + $(this).outerHeight();

      var viewportTop = $(window).scrollTop();
      var viewportBottom = viewportTop + $(window).height();

      if (elementBottom > viewportTop && elementTop < viewportBottom) {
        $(this).css({
          'opacity': '1',
          'transform': 'translateY(0)'
        });
      }
    })
  })
  $(window).trigger('scroll');
});
