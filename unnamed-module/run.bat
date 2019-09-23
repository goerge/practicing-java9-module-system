java --module-path dist --add-modules com.printer.impl -cp dist\printer-client com.printer.client.PrinterClient
java -m dist\printer-impl --add-modules com.printer.impl -cp dist\printer-client com.printer.client.PrinterClient
