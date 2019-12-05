/**
 * 
 * Created by Massimiliano Petruzzi on 14/09/18.
 */
 
************************************
********** REVIEW TAXONOMY *********
************************************
Cardinalità errate, caratteri speciali, alberatura errata dei criteri, impediscono la corretta conversione da file excel a file XML.
Di seguito si trova un elenco di operazioni volte a formattare correttamente il contenuto del documento.

1. Su SUBCRITERION c'è la cardinalità a 0..n (oppure 1..n), così come impostato di default sul documento UE. Cambiare la cardinalità di tutti i SUBCRITERION, impostandola a 1.

2. La struttura di alcuni SUBCRITERION è composta da una CAPTION dentro un SUBCRITERION. Il validator respinge questa struttura. Inserire le CAPTION dentro i QUESTION_GROUP. Di conseguenza, andranno censiti su e-Certis i nuovi UUID delle QUESTION_GROUP (generare gli UUID).

3. Le descrizioni contengono gli apici in corsivo (’). Il trasformatore tronca le descrizioni fino all'apice. Sostituire gli apici in corsivo (’) con gli apostrofi (').

4. Le descrizioni contengono il testo in grassetto e/o in corsivo e/o colorate. Il trasformatore tronca le descrizioni. Sostituire il testo in grassetto e/o corsivo con il testo normale.

5. Se il testo all’interno della cella contiene i caratteri di ritorno a capo e/o tabulazione, il testo viene troncato dal trasformatore. Scrivere il testo su un'unica linea, eliminando i caratteri di ritorno a capo e di tabulazione all'interno cella.

6. Alcune strutture (esempio: subcriterion) non contengono descrizioni, né elementi interni. Eliminare queste strutture.

7. UUID, Cardinalità e Element Code sono mancanti per alcuni QUESTION_GROUP. Aggiungere gli UUID (comunicarne la mancanza), le Cardinalità e gli Element Code mancanti.

8. UUID per alcuni GROUP o SUBGROUP sono duplicati. Cambiare gli UUID (comunicarne l'aggiornamento) perchè devono essere univoci.

9. Una QUESTION del criterio CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.REFERENCES.SUPPLIES_DELIVERY_PERFORMANCE ha come PropertyDataType IDENTIFIER, ma il validator si aspetta un LOT_IDENTIFIER. Cambiare un IDENTIFIER in LOT_IDENTIFIER nel criterio CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.REFERENCES.SUPPLIES_DELIVERY_PERFORMANCE

10. Per alcuni criteri le strutture sono sbagliate (tag di chiusura mancanti, righe vuote). Completare le strutture dei criteri.

11. In alcune celle relative alla colonna Cardinality è presente la cardinalità così scritta 1…n. Sostituire con la stringa 1..n.

12. Le descrizioni vengono estratte direttamente dal file. Revisionare le descrizioni, correggendo gli errori ortografici e completando le descrizioni troncate.

13. Controllare che tutte le PropertyDataType CODE abbiano la colonna Code List popolata con il nome della codelist.



************************************
********** INFO TAXONOMY ***********
************************************
Steps to generate the XML files out from the ESPD-EDM Taxonomy excel file:

1. Manual method: Rename the .ods files as .ods.zip and extract the file 'content.xml'; 
	use an XML editor to load the 'content.xml' file and the XSL-T file. 
	Associate (or reference) the XSLT file to the XML. 
	Launch the transformation from the XML Editor. 
	Save the output file.
	
OR

1. Manual method: Rename the .ods files as .ods.zip and extract the file 'content.xml' in folder '\taxonomy\xml\extract\..'.

2. Customize file .xpr in folder '\taxonomy\xslt\..' to reference files i/o.

3. Use an XML editor to open file .xpr in folder '\taxonomy\xslt\..'.

4. Launch the transformation from the XML Editor. 
	[With <oXygen> editor Right click on .xpr file -> Transform -> Apply Transformation Scenario(s)]



************************************
********** REVIEW CODELIST *********
************************************
Di seguito si trova un elenco di operazioni volte a formattare correttamente il contenuto del documento.

1. Codelist BidType. Per i code OTHER e NOT_SPECIFIED impostare lo status a NOT_ACTIVE

2. Codelist BooleanGUIControlType. Per il code RADIO_BUTTON_TRUE impostare le traduzioni ENG e ITA rispettivamente a 'Economic or financial requirement' e 'Requisito economico o finanziario'. Per il code RADIO_BUTTON_FALSE impostare le traduzioni ENG e ITA rispettivamente a 'Rating requirement' e 'Requisito di rating'. Per il code RADIO_BUTTON_UNSELECTED svuotare le traduzioni ENG e ITA. Per i code CHECK_BOX_TRUE, CHECK_BOX_FALSE e CHECK_BOX_UNSELECTED impostare lo status a NOT_ACTIVE

3. Tutte le codelist. Sincerarsi che non siano presenti righe vuote/indefinite nei vari sheet del foglio di calcolo


	
************************************
********** INFO CODELIST ***********
************************************
Steps to generate the GC files out from the ESPD-EDM Code Lists excel file:

1. Manual method: Open the file ESPD-CodeList-vX.X.X.xlsx and save it locally as 'content.xml', type [Foglio di calcolo XML 2003 (*.xml)], in folder '\codelist\xml\extract\..'.

2. Customize file .xpr in folder '\codelist\xsl\..' to reference files i/o.

3. Use an XML editor to open file .xpr in folder '\codelist\xsl\..'.

4. Launch the transformation from the XML Editor. 
	[With <oXygen> editor Right click on .xpr file -> Transform -> Apply Transformation Scenario(s)]
	