MovSim Viewer
=============

MovSim = **M**ulti-model **o**pen-source **v**ehicular-traffic **Sim**ulator.

http://www.movsim.org

Demonstration: www.verkehrsdynamik.de 


Description
-----------

MovSim is a microscopic traffic simulator with xml-based configuration and csv text output. 

The `viewer` submodule provides a simple GUI interface for visualization.

Installation
------------

For installation see the [README.md](https://github.com/movsim/movsim/blob/master/README.md) in the main MovSim directory.


Usage
-----

To build the MovSim viewer with Maven, type `mvn install` from the MovSim viewer directory.

The MovSim viewer can be started directly from the command-line. To see the MovSim options, type e.g.:

    java -jar viewer/target/MovsimViewer-1.5.0-SNAPSHOT-jar-with-dependencies.jar -h


Commercial use
--------------

For commercial use, please contact the copyright holders at movsim.org@gmail.com


Copyright
---------

MovSim is Copyright (C) 2010, 2011, 2012, 2013 by Arne Kesting, Martin Treiber, Ralph Germ, and Martin Budden.

MovSim is licensed under [GPL version 3](https://github.com/movsim/movsim/blob/master/COPYING).

