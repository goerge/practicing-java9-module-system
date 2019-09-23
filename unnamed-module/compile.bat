javac printer-impl\src\module-info.java printer-impl\src\com\printer\impl\Printer.java -d dist\printer-impl

javac printer-client\src\com\printer\client\PrinterClient.java -p dist\printer-impl --add-modules com.printer.impl -d dist\printer-client
