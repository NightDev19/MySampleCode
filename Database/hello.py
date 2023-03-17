import mysql.connector

mydb = mysql.connector.connect(
    host = "localhost",
    username = "root",
    password = "",
    database = "bsit"
)
#print(mydb)

mycursor = mydb.cursor()
"""
mycursor.execute("drop database if exists BSIT")
print("Deleted Created")
mycursor.execute("create database BSIT")
print("Database Created")
mycursor.execute("CREATE TABLE customers (name VARCHAR(255), address VARCHAR(255))")
"""
sql = "INSERT INTO customers (name, address) VALUES (%s, %s)"
val = ("John", "Highway 21")
mycursor.execute(sql, val)

mydb.commit()

print(mycursor.rowcount, "record inserted.")
