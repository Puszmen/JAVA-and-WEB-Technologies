class Game {
    constructor(title, rating, description) {
        this.title = title;
        this.rating = rating;
        this.description = description;
    }
}

let games = [];

function addTableRow(game) {
    let tableBody = document.getElementById("game-table-body");
    let tableRow = tableBody.insertRow();
    let titleCell = tableRow.insertCell();
    titleCell.appendChild(document.createTextNode(game.title));
    let ratingCell = tableRow.insertCell();
    ratingCell.appendChild(document.createTextNode(game.rating));
    let detailsCell = tableRow.insertCell();
    detailsCell.appendChild(createDetailsButton());
    let deleteCell = tableRow.insertCell();
    deleteCell.appendChild(createDeleteButton());
}

function createDetailsButton() {
    let detailsButton = createButton("Pokaż szczegóły");
    detailsButton.onclick = () => {
        let rowIndex = detailsButton.parentNode.parentNode.rowIndex - 1;
        let game = games[rowIndex];
        let gameDetailsParagraph = document.getElementById("game-details");
        gameDetailsParagraph.textContent = `Opis gry: ${game.description}`;
    };
    return detailsButton;
}

function createDeleteButton() {
    let deleteButton = createButton("Usuń");
    deleteButton.onclick = () => {
        let tableRow = deleteButton.parentNode.parentNode;
        let tableBody = tableRow.parentNode;
        let gameIndex = tableRow.rowIndex - 1;
        tableBody.deleteRow(gameIndex);
        games.splice(gameIndex, 1);
    };
    return deleteButton;
}

function createButton(text) {
    let button = document.createElement("button");
    let buttonBody = document.createTextNode(text);
    button.appendChild(buttonBody);
    return button;
}

(function exampleGames() {
    games.push(new Game("Sekiro Shadows Die Twice", 10, "Gra w której nie giniesz dwa razy jeśli wiesz o co chodzi..."));
    games.push(new Game("God of War", 9, "Gra w której niszczyć to niedopowiedzenie"));
    games.push(new Game("The Sims", 8, "Prawdziwe życie w wirtualnym świecie"));
    games.forEach(game => addTableRow(game));
})();

function addGame() {
    let title = document.getElementById("game-title").value;
        let rating = document.getElementById("game-rating").value;
        let description = document.getElementById("game-description").value;
        let game = new Game(title, rating, description);
        games.push(game);
        addTableRow(game);
}

(function registerAddButtonClick() {
    let addButton = document.getElementById("add-button");
    addButton.onclick = addGame;
})();
