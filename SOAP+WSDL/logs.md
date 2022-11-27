# SOAP #
A protocol which used to transport and invoke via XML
# WSDL #
A specification, a doc for the provided service.
## important lable ##
* Root element: definitions
* types
* message
* operation
* portType
* binding
* service
* port
WSDL file shoud read from bottom to top.
portType equals a class, operation equals there is a method in this class.\
binding define message format and protocol details.
* wsdl:service --> Fine the name of the API
* wsdl:portType --> wsdl:operation, one operation mean one method in this API
* Ensure API methods' parameter sequence and type
  wsdl:binding --> wsdl:operation 
  corresponding message node --> complexType node including request parameter and response
**SoapUI**  tool can generate request via WSDL file, which is useful
