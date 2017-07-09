# -*- coding: utf-8 -*-
# vi: set noexpandtab shiftwidth=4 :

.PHONY: KujiMain
KujiMain.class: KujiMain.java Kuji.class
	javac -encoding UTF-8 KujiMain.java

.PHONY: Kuji
Kuji.class: Kuji.java
	javac -encoding UTF-8 Kuji.java

.PHONY: run
run: 
	java KujiMain

.PHONY: test
test:
	javac -encoding UTF-8 *Test.java
