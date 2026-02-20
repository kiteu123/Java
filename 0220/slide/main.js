document.addEventListener('DOMContentLoaded', () => {

    const imgs = document.querySelector('.imgs');
    const items = document.querySelectorAll('.imgs li');
    const pager = document.querySelectorAll('.pager li');
    const prevBtn = document.querySelector('.prev');
    const nextBtn = document.querySelector('.next');
    const wrap = document.getElementById('wrap');

    const count = items.length;

    let index = 1;
    let timer = null;

    const firstClone = items[0].cloneNode(true);
    const lastClone = items[count - 1].cloneNode(true);

    imgs.append(firstClone);
    imgs.prepend(lastClone);
    imgs.style.transform = 'translateX(-100%)';

    function moveSlide(i, speed = 0.6) {

        if (speed === 0) {
            imgs.style.transition = 'none';
        } else {
            imgs.style.transition = `transform ${speed}s ease`;
        }

        imgs.style.transform = `translateX(${-i * 100}%)`;

        const pagerIndex = (i - 1 + count) % count;

        pager.forEach((p, idx) => {
            p.classList.toggle('on', idx === pagerIndex);
        });


        index = i;
    }

    imgs.addEventListener('transitionend', () => {

        if (index === 0) {
            moveSlide(count, 0);
        }

        else if (index === count + 1) {
            moveSlide(1, 0);
        }

    });

    nextBtn.addEventListener('click', () => {
        moveSlide(index + 1);
    });

    prevBtn.addEventListener('click', () => {
        moveSlide(index - 1);
    });

    pager.forEach((p, i) => {

        p.addEventListener('click', () => {
            moveSlide(i + 1);
        });

    });

    function startAuto() {

        if (timer) return;

        timer = setInterval(() => {
            moveSlide(index + 1);
        }, 3000);

    }

    function stopAuto() {

        clearInterval(timer);
        timer = null;
    }

    wrap.addEventListener('mouseenter', stopAuto);
    wrap.addEventListener('mouseleave', startAuto);

    startAuto();

});