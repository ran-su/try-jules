document.addEventListener('DOMContentLoaded', () => {
    const slides = document.querySelectorAll('.slide');
    const prevBtn = document.getElementById('prev-btn');
    const nextBtn = document.getElementById('next-btn');
    let currentSlide = 0;

    function showSlide(index) {
        // Hide all slides
        slides.forEach(slide => {
            slide.classList.remove('active');
        });

        // Show the target slide
        if (slides[index]) {
            slides[index].classList.add('active');
        }

        // Update button states
        prevBtn.disabled = index === 0;
        nextBtn.disabled = index === slides.length - 1;
    }

    function nextSlide() {
        if (currentSlide < slides.length - 1) {
            currentSlide++;
            showSlide(currentSlide);
        }
    }

    function prevSlide() {
        if (currentSlide > 0) {
            currentSlide--;
            showSlide(currentSlide);
        }
    }

    // Event Listeners for buttons
    nextBtn.addEventListener('click', nextSlide);
    prevBtn.addEventListener('click', prevSlide);

    // Keyboard navigation
    document.addEventListener('keydown', (event) => {
        if (event.key === 'ArrowRight') {
            nextSlide();
        } else if (event.key === 'ArrowLeft') {
            prevSlide();
        }
    });

    // Initially, show the first slide
    if (slides.length > 0) {
        showSlide(currentSlide);
    } else {
        // If there are no slides, hide navigation
        prevBtn.style.display = 'none';
        nextBtn.style.display = 'none';
    }
});
