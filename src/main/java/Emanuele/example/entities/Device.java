package Emanuele.example.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "device")
@Data
public class Device {

	@Id
	@GeneratedValue
	private UUID id;
	
	private TypeDevice typeDevice;
	private StateDevice stateDevice;
	
	
	public Device(TypeDevice typeDevice, StateDevice stateDevice) {
		super();
		this.typeDevice = typeDevice;
		this.stateDevice = stateDevice;
	}
}
