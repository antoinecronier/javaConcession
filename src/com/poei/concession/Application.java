package com.poei.concession;

import com.poei.concession.model.Car;
import com.poei.concession.model.Garage;
import com.poei.concession.model.Technician;
import com.poei.concession.model.Wheel;

public class Application {

	public static void main(String[] args) {
		Garage monSuperGarage = new Garage("MonSuperGarage");
		monSuperGarage.getTechnician().add(new Technician("Jojo",monSuperGarage));
		monSuperGarage.getTechnician().add(new Technician("Mick",monSuperGarage));
		for (int i = 0; i < 4; i++) {
			monSuperGarage.getStock().add(new Wheel(24));
		}
		for (int i = 0; i < 8; i++) {
			monSuperGarage.getStock().add(new Wheel(32));
		}

		Car titi = new Car("Titi",24);
		monSuperGarage.recieve(titi);

		Car toto = new Car("Toto",32);
		monSuperGarage.recieve(toto);

		Car tata = new Car("Tata",24);
		monSuperGarage.recieve(tata);

		System.out.println();

		monSuperGarage.delivery("Titi");
		monSuperGarage.delivery("Toto");
		monSuperGarage.delivery("Tata");
	}

}
