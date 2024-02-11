function addText() {
    const text = "Hello World";
    const textContainer = document.getElementById("text-container");
    textContainer.classList.add("dynamic");
    simulateTextMachine(textContainer, text);
}

function simulateTextMachine(element, text) {
    for (let i = 0; i < text.length; i++) {
        const letter = text.charAt(i);
        setTimeout(() => element.append(letter), (i + 1) * 500);
    }
}

addText();