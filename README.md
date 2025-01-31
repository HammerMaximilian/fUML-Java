<img src="logo.png" width="300"/>

# fUML/PSCS Reference Implementation for *Java*
This software is an open source reference implementation of the *Semantics of a Foundational Subset for Executable UML Models* (fUML)  specifications by the *Object Management Group* (OMG) (see [fUML](https://www.omg.org/spec/FUML/1.5/About-FUML)). The fUML implementation of this software is a ont-on-one port of the original Java fUML reference implementation developed by
*Model Driven Solutions* (see [https://github.com/ModelDriven/fUML-Reference-Implementation](https://github.com/ModelDriven/fUML-Reference-Implementation))

## Licensing
For licensing information, please see the [LICENSE.md](https://github.com/HammerMaximilian/fUML-Java/blob/master/LICENSE) file.

## Prerequisites
For detailed information, please see the [User Guide](fUML-Java_User_Guide.pdf) section *1. Prerequisites*.
### 1. Required Software
* Compiler: *GCC* (Linux) or *MinGW-w64* (Windows)
* *Java Runtime Environment*
* *Eclipse IDE for Java Developers*
### 2. Recommended but optional Software
* *Eclipse Modeling Tools* for creating UML models
* *Eclipse Papyrus* for more sophisticated and graphical modeling of UML models
* *Acceleo* to be able to use the code generator for executable models

## Setup
For detailed information, please see the [User Guide](fUML-Java_User_Guide.pdf) section *2. Setup*.
### 1. Setting up Eclipse
* Import fUML-Java root project *fUML-Java* into your workspace
* Import nested projects *uml* and *fuml*

## Building
For detailed information, please see the [User Guide](fUML-Java_User_Guide.pdf) section *3. Build*.
* No further build required, compilation is done automatically by the *Eclipse IDE*[^1]
[^1]: Instructions for external build, i.e., without any IDE, will be added in the future.

## Usage
For detailed information, please see the [User Guide](fUML-Java_User_Guide.pdf) section *4. Usage*.
### 1. Creating executable models using source code
* Create new Java project (see `"<fUML-Java-rootdir>\examples\helloworld"` as a reference project)
  * NOTE: it is suggested to store user-defined source code projects in common directory `"<fUML-Java-rootdir>\usersrc"`
  * The *usersrc* directory may contain arbitrary nested subdirectories
* Add the *uml* and *fuml* projects to the classpath of your project
* Create a `<model-name>Environment` class by extending class `utils.environmentfuml.Environment`
* Create a `<model-name>Model` class by extending class `utils.environment.InMemoryModel` (this class will contain all of your model elements)
* Create a class containing a main method and call `<model-name>Environment.instance().execute("<behavior-name>");` for each behavior you want to execute in subsequent order
* Run your project as a Java application within the *Eclipse IDE*
### 2. Generating executable models from *.uml* models (*Acceleo* plugin for Eclipse has to be installed)
* Create new *.uml* model with a modeling tool of your choice (*Eclipse Papyrus* is suggested)
  * NOTE: it is suggested to store user-defined models in common directory `"<fUML-Java-rootdir>\usermodels"`
  * The *usermodels* directory may contain arbitrary nested subdirectories
* Import nested project *generator* within fUML-Java root project
* Navigate to file `\generator\src\fuml.generator.main\generate.mtl` in the project explorer
* Right click `generate.mtl` and choose `Run as`-->`Run configurations...`
* Configure and run Acceleo Application accordingly:
  *  Choose `fuml.generator.main.Generate`
  *  Choose your model file
  *  Choose a target directory for the generated source code (`"<fUML-Java-rootdir>\usersrc\<model-name>"` is suggested)
* Import newly generated Java project within fUML-Java root project and configure a run configuration
* Add program arguments to define behaviors to be executed using `<behavior-name> [<behavior-name> <behavior-name> <behavior-name> <...>]`
 * Run as Java application within the *Eclipse IDE*
