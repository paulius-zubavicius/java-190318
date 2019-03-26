package com.vcs.lects.l07.oop.tasks;

public class Relations {

}

class Zmogus {
	private Plaukai plaukai;
	private Pilietybe[] pilietybes;
	private Suo[] sunys;
	//getters and setters goes here.... below
}

class Vaikas extends Zmogus {
	private Motina motina;
	private Tevas tevas;
}

class Suauges extends Zmogus {}
class Moteris extends Suauges {}
class Vyras extends Suauges{}

class Tevas extends Vyras {
	private Vaikas[] vaikai;
}
class Motina extends Moteris {
	private Vaikas[] vaikai;
}

class Pilietybe {}

class Plaukai {}

class Suo {
	private Plaukai plaukai;
}
