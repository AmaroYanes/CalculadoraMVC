package dad.mvc.calculadora.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.mvc.calculadora.model.Calculadora;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class CalculadoraController implements Initializable {
	
	//model
	
	Calculadora model = new Calculadora();
	
	
	//view
	
	@FXML
    private GridPane root;

    @FXML
    private Button cero;

    @FXML
    private Button igual;

    @FXML
    private Button uno;

    @FXML
    private Button cuatro;

    @FXML
    private Button dividir;

    @FXML
    private Button siete;

    @FXML
    private Button cinco;

    @FXML
    private Button dos;

    @FXML
    private Button punto;

    @FXML
    private Button ocho;

    @FXML
    private Button nueve;

    @FXML
    private Button borrarEntrada;

    @FXML
    private Button borrarTodo;

    @FXML
    private Button seis;

    @FXML
    private Button multiplicar;

    @FXML
    private Button tres;

    @FXML
    private Button restar;

    @FXML
    private Button sumar;

    @FXML
    private TextField operacion;
	
	
	public CalculadoraController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	
	public void initialize(URL location, ResourceBundle resources) {
		// bindeos
		model.pantallaProperty().bindBidirectional(operacion.textProperty());
		cero.setOnAction(e -> onActionOperando(cero.getId()));
		uno.setOnAction(e -> onActionOperando(uno.getId()));
		dos.setOnAction(e -> onActionOperando(dos.getId()));
		tres.setOnAction(e -> onActionOperando(tres.getId()));
		cuatro.setOnAction(e -> onActionOperando(cuatro.getId()));
		cinco.setOnAction(e -> onActionOperando(cinco.getId()));
		seis.setOnAction(e -> onActionOperando(seis.getId()));
		siete.setOnAction(e -> onActionOperando(siete.getId()));
		ocho.setOnAction(e -> onActionOperando(ocho.getId()));
		nueve.setOnAction(e -> onActionOperando(nueve.getId()));
		borrarTodo.setOnAction(e -> onActionborrarTodo());
		borrarEntrada.setOnAction(e -> onActionborrarEntrada());
		punto.setOnAction(e -> onActionInsertarComa());
		restar.setOnAction(e -> onActionOperar(restar.getId()));
		sumar.setOnAction(e -> onActionOperar(sumar.getId()));
		multiplicar.setOnAction(e -> onActionOperar(multiplicar.getId()));
		dividir.setOnAction(e -> onActionOperar(dividir.getId()));
		igual.setOnAction(e -> onActionOperar(igual.getId()));
		
	}
    private void onActionOperar(String id) {
		switch(id) {
			case "restar":{
				model.operar('-');
				break;
			}
			case "sumar":{
				model.operar('+');
				break;
			}
			case "multiplicar":{
				model.operar('*');
				break;
			}
			case "dividir":{
				model.operar('/');
				break;
			}
			case "igual" :{
				model.operar('=');
			}
		}
	}


	private void onActionInsertarComa() {
    	model.insertarComa();
	}


	private void onActionborrarEntrada() {
    	model.borrar();
	}


	private void onActionborrarTodo() {
		model.borrarTodo();
	}


	private void onActionOperando(String id) {
		switch(id) {
			case "cero":{
				model.insertar('0');
				break;
			}
			case "uno":{
				model.insertar('1');
				break;
			}
			case "dos":{
				model.insertar('2');
				break;
			}
			case "tres":{
				model.insertar('3');
				break;
			}
			case "cuatro":{
				model.insertar('4');
				break;
			}
			case "cinco":{
				model.insertar('5');
				break;
			}
			case "seis":{
				model.insertar('6');
				break;
			}
			case "siete":{
				model.insertar('7');
				break;
			}
			case "ocho":{
				model.insertar('8');
				break;
			}
			case "nueve":{
				model.insertar('9');
				break;
			}
		}
	}
	public GridPane getView() {
		return root;
	}
	
}
