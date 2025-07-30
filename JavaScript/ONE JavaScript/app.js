// Secret Game
let puntuacion = 0;
let intentos = 0;
let limit = 10;
while ( !(puntuacion > 100) ||  !(puntuacion < 0)) {
    let numeroSecreto = Math.floor(Math.random * limit) + 1;
    alert ("Adivina el numero entre 1 y " + limit);
    let numeroUsuario = prompt("Indícame un numero: ");
    console.log (numeroUsuario);
    console.log (numeroSecreto);
    if (numeroUsuario == numeroSecreto) {
        alert ("Numero Correcto!!! El numero era: " + numeroSecreto);
        puntuacion + 50;
        intentos = intentos + 1;
    } else {
        alert ("Numero incorrecto, perdedor!!!");
        puntuacion - 10;
        intentos = intentos + 1;
        if (numeroUsuario < numeroSecreto) {
            alert ("El numero es grande!!!");
        } else {
            alert ("El numero es mas pequeño!!!");
        }
    }
    if (intentos > 5) {
        alert ("Te pasaste de intentos, " + nameUser);
        break;
    }
}
if (puntuacion >= 100) {
    alert ("GANASTE!!! Alcanzaste la puntuacion maxima. \n Lo lograste en " + intentos + " intentos");
} else {
    alert ("Perdiste todos tus puntos, que mal lo haces!!! \n Tuviste " + intentos + " intentos");
}