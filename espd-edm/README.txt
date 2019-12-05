/**
 * 
 * Created by Massimiliano Petruzzi on 14/09/18.
 */
 
***************************
********** INFO ***********
***************************

1. Modify Schema XSD in folder '\espd-edm\src\main\java\schema\..'.
	[If files Schema XSD are changed, upload them on '\espd-manual\v2.1.0\xsdrt\..']

2. Modify directories in section 'plugins' in file pom.xml 
	[Use directory 'src\main\generated' for generateDirectory]

3. Clean directory 'src\main\generated'.

4. Clean directory 'src\main\java', except packages 'schema.*' and 'eu.europa.ec.grow.espd.edm.xml'.
	
5. Execute command 'mvn clean install'.

6. Cut and paste packages and files from 'src\main\generated' to 'src\main\java'.

