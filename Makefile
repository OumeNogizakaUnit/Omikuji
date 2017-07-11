# -*- coding: utf-8 -*-
# vi: set noexpandtab shiftwidth=4 :

.PHONY: KujiMain
KujiMain.class: KujiMain.java Kuji.class
	javac -encoding UTF-8 KujiMain.java
	java KujiMain

.PHONY: Kuji
Kuji.class: Kuji.java
	javac -encoding UTF-8 Kuji.java

.PHONY: run
run: KujiMain.class
	java KujiMain
