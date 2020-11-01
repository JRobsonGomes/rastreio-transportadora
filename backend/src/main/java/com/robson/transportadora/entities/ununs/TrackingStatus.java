package com.robson.transportadora.entities.ununs;

public enum TrackingStatus {

	ENTIQUETA_CRIADA(1, "Etiqueta Criada"),
	ENVIADO(2, "Enviado"),
	TRANSPORTE(3, "Em Transporte"),
	ENTREGUE(4, "Entre ao Destinatário");
	
	private int code;
	private String descricao;

	private TrackingStatus(int code, String descricao) {
		this.code = code;
		this.descricao = descricao;
	}

	public int getCode() {
		return code;
	}

	public String getDescricao () {
		return descricao;
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
