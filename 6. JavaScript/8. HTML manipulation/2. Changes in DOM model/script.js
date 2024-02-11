function addSportNews() {
    let newsList = document.querySelector("#sport-news");
    let li = document.createElement("li");
    let text = document.createTextNode("Brazylia ponownie mistrzami świata");
    li.appendChild(text);
    newsList.appendChild(li);
}
addSportNews();

function removeSecondNews() {
    let secondNews = document.querySelector("#news-list > li:nth-child(2)");
    secondNews.remove();
}
removeSecondNews();


function changeHeadings() {
    let news = document.getElementById("news");
    news.innerHTML = "Wesołe Newsy";

    let sport = document.getElementById("sport");
    sport.innerHTML = "Anty Sport";
}
setTimeout(changeHeadings, 3000);

function addDynamicClasstoH2() {
    let h2Elements = document.getElementsByTagName("h2");
    for (let i = 0; i < h2Elements.length; i++) {
        const element = h2Elements[i];
        element.classList.add("dynamic");
    }
}
addDynamicClasstoH2();

function addDynamoClassToBullets() {
    let secondBullets = document.querySelectorAll("ul > li:nth-child(2)");
    const addDynamoClass = element => element.classList.add("dynamo");
    secondBullets.forEach(addDynamoClass);
}
addDynamoClassToBullets();
