document.addEventListener("DOMContentLoaded", () => {
    const chapterList = document.getElementById("chapter-list");

    // Fetch chapters from the API
    fetch('/api/chapters')
        .then(response => response.json())
        .then(chapters => {
            chapterList.innerHTML = ""; // Clear existing list

            Object.keys(chapters).forEach(chapter => {
                const chapterData = chapters[chapter];
                const li = document.createElement("li");
                li.innerHTML = `
                    <strong>${chapter}</strong>
                    <ul>
                        <li><strong>Programs:</strong> ${chapterData.programs.join(", ")}</li>
                        <li><strong>Exercises:</strong> ${chapterData.exercises.join(", ")}</li>
                    </ul>
                `;
                chapterList.appendChild(li);
            });
        })
        .catch(error => console.error("Error fetching chapters:", error));
});
