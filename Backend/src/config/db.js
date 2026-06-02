const sql = require("mssql");

const config = {
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    server: "localhost",
    port: 51221,
    database: process.env.DB_DATABASE,

    options: {
        encrypt: false,
        trustServerCertificate: true
    }
};

console.log(config);

async function connectDB() {
    try {
        await sql.connect(config);
        console.log("SQL Server Connected");
    } catch (error) {
        console.error(error);
    }
}

module.exports = {
    sql,
    connectDB
};