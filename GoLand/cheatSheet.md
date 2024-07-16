a alt  
c ctrl  
s1 shift  
s2 space  
e enter
t tab

* Views:
  * a+1 project view
  * a+5 close debug view

* Code:
  * c+s2 basic completion
  * c+s1+s2 smart completion
  * a+e preview yellow warning and apply a quick fix
  * s1-twice search the selected word, then search for the options. For example, search for case to apply case toggle
      * can be used to edit the IDE settings
  * F2 navigate to Data Flow Analysis
  * c+y delete selected code
  * type rr to pop up the autocompletion for err check if there is a err return
* Editor:
  * c+s1+rightArrow move the caret to next word and select all in between
  * c+2 extends the selection
  * c+s1+w shrinks the selection
  * c+s1+/ comment out the block
  * c+d duplicate the line
  * a+s1+downArrow move current line down
  * c+s1+upArrow move the function up (caret on the func line)
  * c+- collpse the code
  * c++ expand the code
  * c+s1+- collpse all code
  * c+s1+= expand all code
  * c+a+t surround the selected code
  * c+s1+delete unwrap the code
  * a+j select the symbol, again the select the next occurance
  * a+s1+j deselect the last occurance
  * c+a+s1+j select all occurance in the file
  
* Code Completion
  * type `fmtpri` select the function Printf, `Enter`
    * c+s2 to see completion suggestion, t replace the word
  * type a dot after string and press `c+s2 twice`, IDE finds all functions that accept string as the first argument
  * Postfix completion - type the dot after the `variable` name

* Statement Completion
  * c+s1+e complete the for statement (add the parentheses)
  * type `if` then press `enter` generate statement
  * add the if condition, then press `c+s1+e` jump into the if statement

* Refactorings
  * place the caret in a symbol then type `s1+f6`
  * c+a+v extract the variable, select a express -> type -> `enter`
  * c+a+n inline variable
  * c+a+m extract method
  * c+a+s1+t list all refactoring options

* Code assistance
  * right click -> `local history`
  * c+a+l GoLand reformat the selected code or whole file
  * c+a+s1+F go fmt
  * c+p see the method signature
  * c+q to see the doc
  * c+s1+i to see the definition of the symbol
  * copy and past a JSON could convert JSON to a struct type automatically
    * c+a+s1+t select the embeded struct then extract it out
    * a+e click **change field..** update the field names in tags to camelCase 
    * a+e click **update key value in tags**, and extra thing like **omitempty**
    
