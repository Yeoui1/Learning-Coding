function pepe() {
    print("Hello");
}

// Bienvenida
alert ("¡Bienvenidos a nuestro sitio web!");

// Nombre y edad del usuario
let nameUser;
let age;
nameUser = prompt ("Dime tu nombre: ");
alert ("Hola, " + nameUser + "!!!");
age = prompt("Dime tu edad: ");
// 
if (age < 18) {
    alert ("Sal de aquí," + nameUser + " eres menor de edad!!!");
} else {
    alert ("Felicidades, " + nameUser + " eres mayor de edad!!!");
}

// Datos de cuenta de usuario
let numeroDeVentas = 50;
let saldoDisponible = 1000;
alert ("El saldo de su cuenta es: " + saldoDisponible);

// Error handling
let mensajeDeError = "¡Error! Rellena todos tus datos";
if (!nameUser || !age ) {
    alert (mensajeDeError);
} else {
    alert ("Datos completos!!!");
}

// Weekends detector
let dia = prompt ("Que dia es hoy?");
if (dia == "Sábado" || dia == "Domingo") {
    alert ("Feliz fin de semana!!!");
} else {
    alert("Disfruta tu semana!!!");
}

// Negative or positive detector
let possibleNumber = prompt ("Dime un numero por debajo de 0 o sobre 0: ");
if (possibleNumber < 0) {
    alert ("Tu numero es negativo!!!");
} else {
    alert ("Tu numero es positivo!!!");
}

// Counters
let cuenta1 = prompt ("Dame un numero menor a 10: ");
if (cuenta1 > 10) {
    alert ("Excediste el numero máximo!!!");
} else {
    alert ("Comienza cuenta regresiva en " + cuenta1 + ": ");
    while (cuenta1 > 0) {
        cuenta1 = cuenta1 -1;
        alert (cuenta1 + " Mississippi");
    }
}
let cuenta2 = prompt ("Dame un numero menor a 10: ");
if (cuenta2 > 10) {
    alert ("Excediste el numero máximo!!!");
} else if (cuenta2 == 10) {
    alert("No hay mucho que hacer si elijes el numero máximo, sabes?");
    } else {
        alert ("Comienza cuenta progresiva en " + cuenta2 + ": ");
        while (cuenta2 < 10) {
            cuenta1 = cuenta1 -1;
            alert (cuenta1 + " Mississippi");
        }
    }