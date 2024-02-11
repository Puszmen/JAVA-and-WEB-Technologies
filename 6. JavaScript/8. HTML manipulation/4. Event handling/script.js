function registerEnableButton() {
    let enableButton = document.getElementById("enable-button");
    enableButton.onclick = function() {
        let counterButton = document.getElementById("counter-button");
        counterButton.addEventListener("click", incrementCounter);
    }
}

function registerDisableButton() {
    let disabpleButton = document.getElementById("disable-button");
    disabpleButton.onclick = function() {
        let counterButton = document.getElementById("counter-button");
        counterButton.removeEventListener("click", incrementCounter);
    }
}

function incrementCounter() {
    document.getElementById("counter").innerHTML++;
}

registerDisableButton();
registerEnableButton();

// function registerButtonClick() {
//     let button = document.getElementById("counter-button");
//     button.addEventListener("click", () => document.getElementById("counter").innerHTML++);
//     button.addEventListener("click", () => document.getElementById("counter").innerHTML++);
//     button.addEventListener("click", () => document.getElementById("counter").innerHTML++);
// }
// registerButtonClick();