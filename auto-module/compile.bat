javac printer-impl\src\module-info.java printer-impl\src\com\printer\impl\Printer.java -p lib -d dist\printer-impl

javac printer-client\src\module-info.java printer-client\src\com\printer\client\PrinterClient.java -p dist\printer-impl -d dist\printer-client
