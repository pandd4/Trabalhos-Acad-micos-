// JavaScript para rolagem suave (Smooth Scroll)
document.addEventListener('DOMContentLoaded', () => {
    const headerCta = document.querySelector('.cta-principal-header');

    if (headerCta) {
        headerCta.addEventListener('click', function(e) {
            e.preventDefault();
            
            const targetId = this.getAttribute('href');
            const targetElement = document.querySelector(targetId);

            if (targetElement) {
                targetElement.scrollIntoView({
                    behavior: 'smooth'
                });
            }
        });
    }
});
