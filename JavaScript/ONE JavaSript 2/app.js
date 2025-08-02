                            /* 
                            ///
                            Start Game Logic 
                            ///
                            */
const playerGuess = document.getElementById('numberTryout');
const gameText = document.getElementById('rangeText');
let currentMin = parseInt(playerGuess.min);
console.log(currentMin);
let currentMax = parseInt(playerGuess.max);
console.log(currentMax);
let puntuacion = 0;
console.log(puntuacion);
let intentos = 0;
console.log(intentos);
let usedNumbers = [];
console.log (usedNumbers);

function assignRange(minRange, maxRange) {
    minRange = parseInt(prompt ("Ingresa el rango mínimo para adivinar: "));
    maxRange = parseInt(prompt ("Ingresa el rango máximo para adivinar: "));
    
    if (isNaN(minRange) || isNaN(maxRange)) {
        alert("Por favor, ingresa números validos.");
        return;
    }
    if (minRange >= maxRange) {
        alert("El mínimo debe ser mas pequeño que el máximo.");
        return;
    }

    currentMin = minRange;
    playerGuess.min = currentMin;
    console.log(currentMin);
    currentMax = maxRange;
    playerGuess.max = currentMax
    console.log(currentMax);
    puntuacion = 0;
    console.log(puntuacion);
    intentos = 0;
    console.log(intentos);

    gameText.textContent = 'Elige un numero entre ' + minRange + " y " + maxRange + ":";
    numeroSecreto = Math.floor(Math.random()*(currentMax - currentMin + 1)) + currentMin;
    console.log(numeroSecreto);
    return numeroSecreto;
}

function secretNumber() {
    let genNumber = Math.floor(Math.random()*(currentMax - currentMin + 1)) + currentMin;
    if (usedNumbers.length == ((currentMax - currentMin) + 1 )) {
        alert ("Felicidades, haz adivinado todos los números dentro del rango");
    } else {
        if (usedNumbers.includes(genNumber)) {
            return secretNumber();
        } else {
            usedNumbers.push(genNumber);
            return genNumber;
        }
    }
}

let numeroSecreto = secretNumber();
console.log(numeroSecreto);

function verificarIntento () {
    let numeroUsuario = parseInt(document.getElementById('numberTryout').value);
    alert ("Haz iniciado el juego del numero secreto.\nTu puntuacion actual es: " + puntuacion + "\nLa puntuacion maxima es de 100.\nTienes " + (3 - intentos) + " intentos para superarla, suerte!!!");
    document.getElementById().setAttribute('disabled', 'false');
    return secretGame(numeroUsuario);
}

function secretGame (numeroUsuario) {
    intentos = intentos + 1;
    if (numeroUsuario == numeroSecreto) {
        gameText.textContent = "Felicidades acertaste el numero secreto!!!";
        puntuacion = puntuacion + 50;
        numeroSecreto = secretNumber();
        alert ("Nuevo numero secreto creado!!!");
    } else if (numeroUsuario < numeroSecreto) {
        gameText.textContent = "Te haz equivocado, el numero secreto es mas grande!!!";
        puntuacion = Math.max(0, puntuacion - 10);
    } else {
        gameText.textContent = "Te haz equivocado, el numero secreto es mas pequeño!!!";
        puntuacion = Math.max(0, puntuacion - 10);
    }
    endChecker();
    playerGuess.value = "";
}

function pointChecker (score) {
    if (score > 100) {
        gameText.textContent = "Felicidades has superado la puntuacion maxima";
        return true;
    } else {
        alert ("Tu puntuacion actual es de: " + score);
        return false;
    }
}

function tryChecker(tries) {
    if (tries > 3) {
        gameText.textContent = "Te haz pasado del numero máximo de intentos";
        return true;
    } else {
        alert ("Llevas: " + tries + " intentos.")
        return false;
    }
}

function endChecker() {
    if (tryChecker(intentos) || pointChecker(puntuacion)) {
        alert ('El juego ha terminado');
        numeroSecreto = secretNumber();
        puntuacion = 0;
        intentos = 0;
        playerGuess.value = "";
    } else {
        alert ("El juego prosigue");
    }
}

function resetGame () {
    numeroSecreto = secretNumber();
    puntuacion = 0;
    intentos = 0;
    playerGuess.value = "";
    usedNumbers = [];
    document.getElementById().setAttribute('disabled', 'true');
}
                            /* 
                            ///
                            End Game Logic 
                            ///
                            */


function textAssigner (element, text) {
    let htmlElement = document.querySelector(element);
    htmlElement.textContent = text;
}
textAssigner('h1', 'Juego del numero secreto!!');
textAssigner('p', 'Elige un numero entre 1 y 10');
function consoleLog() {
    console.log ("El botón fue presionado");
}
function promptCity() {
    let sinCity = prompt("Dime un país: ");
    alert("Estuve en " + sinCity + " y me acorde de ti.");
}
function loveJS() {
    alert ("Yo amo JS");
}
function sum() {
    let counter = 0;
    let suma = 0;
    let limit  = prompt ("Cuantos números quieres sumar?")
    while (counter < limit) {
        let input = prompt("Numero " + (counter + 1) + ": ");
        suma = suma + parseInt(input);
        counter++;
    }
    alert ("La suma de esos 2 números es: " + suma);
}
