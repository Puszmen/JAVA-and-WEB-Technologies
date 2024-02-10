function showNewsHeading() {
    let newsHeading = document.getElementById("news");
    console.log(newsHeading.innerHTML);
}
showNewsHeading();

function showFirstNews() {
    let newsList = document.getElementById("news-list");
    console.log(newsList.getElementsByTagName("li")[0].innerHTML);
}
showFirstNews();

function showSportNews() {
    let sportNews = document.querySelectorAll("ul#sport-news > li");
    sportNews.forEach(elem => console.log(elem.innerHTML));
}
showSportNews();
