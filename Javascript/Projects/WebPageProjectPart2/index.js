document.addEventListener("DOMContentLoaded", () => {
    let index = 0;
    displayImages();

    function displayImages() {
        let i;
        const images = document.getElementsByClassName("image");
        console.log(images); // Log the images array
        for (i = 0; i < images.length; i++) {
            images[i].style.display = "none";
        }
        index++;
        if (index > images.length) {
            index = 1;
        }
        console.log("Displaying image index: " + (index - 1)); // Log the current image index
        images[index - 1].style.display = "block";
        setTimeout(displayImages, 2000);
    }
});

document.addEventListener("DOMContentLoaded", () => {
    const faqData = [
        {
            question: "What is the origin of anime?",
            answer: "The origins of anime can be traced back to the early 20th century when Japanese filmmakers began experimenting with animation techniques pioneered in France, Germany, and the United States."
        },
        {
            question: "What was the first popular anime?",
            answer: "'Astro Boy' (Tetsuwan Atomu), created by Osamu Tezuka, started airing in 1963 and is considered one of the first popular anime series."
        },
        {
            question: "What are some of the most influential anime from the 1970s?",
            answer: "The 1970s introduced many new genres and saw the rise of mecha anime like 'Mobile Suit Gundam.'"
        },
        {
            question: "How did anime gain global popularity?",
            answer: "In the 1990s, anime embraced technological advancements and expanded globally with series like 'Neon Genesis Evangelion' and films by Studio Ghibli."
        },
        {
            question: "What are some popular contemporary anime?",
            answer: "Some popular contemporary anime include 'Attack on Titan' and 'My Hero Academia.'"
        }
    ];

    const faqContainer = document.getElementById('faq-container');

    faqData.forEach(item => {
        const faqItem = document.createElement('div');
        faqItem.className = 'faq-item';

        const question = document.createElement('p');
        question.className = 'faq-question';
        question.textContent = item.question;
        question.addEventListener('click', () => {
            const answer = question.nextElementSibling;
            answer.style.display = answer.style.display === 'block' ? 'none' : 'block';
        });

        const answer = document.createElement('p');
        answer.className = 'faq-answer';
        answer.textContent = item.answer;

        faqItem.appendChild(question);
        faqItem.appendChild(answer);
        faqContainer.appendChild(faqItem);
    });
});
