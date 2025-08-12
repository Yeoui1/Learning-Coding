const friendEntry = document.getElementById("friendInput");
const userFeed = document.getElementById("warningText");
let friends = [];
const table = document.getElementById("friendsLeaderboard");
const tbody = table.createTBody();

// Función para capitalizar el nombre
function formatName(name) {
    name = name.trim().toLowerCase();
    return name.charAt(0).toUpperCase() + name.slice(1);
}

// Función para agregar amigos a la tabla 
function addFriend() {
    let rawData = friendEntry.value;
    let formattedData = formatName(rawData);

    // Verificar que el usuario haya ingresado un dato
    if (!formattedData.length) {
        userFeed.textContent = "Introdujiste un valor vacío";
        friendEntry.value = "";
        return;
    }

    // Verificar que el usuario no haya ingresado un dato repetido
    if (repeatFriend(formattedData)) {
        userFeed.textContent = `Ya tienes un amigo que se llama "${formattedData}"!!`;
        friendEntry.value = "";
        return;
    }

    // Agregar amigo
    console.log("Agregando amigo...");
    friends.push(formattedData);
    console.log(friends);

    const row = tbody.insertRow();
    const cell = row.insertCell();
    cell.textContent = formattedData;

    userFeed.textContent = `Nuevo amigo agregado: ${formattedData}!!`;
    friendEntry.value = "";
}

// Función para verificar si ya existe el amigo independiente de símbolos
function repeatFriend(name) {
    const normalizedName = name.trim().toLowerCase();
    return friends.some(friend => friend.trim().toLowerCase() === normalizedName);
}