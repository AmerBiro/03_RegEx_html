ANTLRJAR = /usr/local/lib/antlr-4.8-complete.jar

###export CLASSPATH := .:$(ANTLRJAR):${CLASSPATH}
antlr4 = java -jar $(ANTLRJAR)
grun = java org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = datoListener.java datoBaseListener.java datoParser.java datoBaseVisitor.java datoVisitor.java datoLexer.java

all:
	make main.class

main.class:	$(SRCFILES) $(GENERATED) dato.g4
	javac  $(SRCFILES) $(GENERATED)

datoListener.java:	dato.g4
	$(antlr4) -visitor dato.g4

test:	main.class
	java main dato_input.txt

grun:	main.class
	$(grun) dato start -tree -tokens dato_input.txt 
