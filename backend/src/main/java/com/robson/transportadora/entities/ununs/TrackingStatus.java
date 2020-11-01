package com.robson.transportadora.entities.ununs;

public enum TrackingStatus {

	ENTIQUETA_CRIADA(1),
	ENVIADO(2),
	EM_TRANSPORTE(3),
	ENTREGUE_AO_DESTINATÁRIO(4);
	
	private int code;

	private TrackingStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static TrackingStatus valueOf(int code) {
		for (TrackingStatus value : TrackingStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid TrackingStatus code");
	}
}
