$(function() {
	var funcionario_id = 0;
	var exame = 0;
	var prestador = 0;
	var data = "";
	var hora = "";
  	$('#hora').mask('00:00');
	
	$("#reset").on('click', function(){
		funcionario_id = 0;
		exame = 0;
		prestador = 0;
		data = "";
		hora = "";
		$('.app').hide().promise().done(function() {
			$("#select_funcionario").fadeIn();
		});
	});
	
	$(".app").hide().promise().done(function() {
		$("#select_funcionario").fadeIn();				
	});
	
	$("#select_funcionario li").on('click', function() {
		funcionario_id = $(this).data('funcionario-id');
		$('#select_funcionario').fadeOut().promise().done(function() {
			$('#select_opcao').fadeIn();
		});
	});
	
	$("#select_opcao figure").on('click', function() {
		var opcao = $(this).data('opcao');
		
		if(opcao == 1) {
			window.location.href = "agendamentos?cd_funcionario=" + funcionario_id;
		} else {
			$("#select_opcao").fadeOut().promise().done(function() {
				$("#novo_agendamento_exame").fadeIn();
			});
		}
	});
	
	$('#novo_agendamento_exame li').on('click', function() {
		exame = $(this).data('exame-id');
		$("#novo_agendamento_exame").fadeOut().promise().done(function() {
			$("#novo_agendamento_prestador").fadeIn();
		});
	});
	
	$('#novo_agendamento_prestador li').on('click', function() {
		prestador = $(this).data('prestador-id');
		alert(prestador);
		$("#novo_agendamento_prestador").fadeOut().promise().done(function() {
			$("#novo_agendamento_data_hora").fadeIn();
		});
	});
	
	$('#novo_agendamento_data_hora #confirma_agendamento').on('click', function() {
		data = $("#data").val();
		hora = $("#hora").val();

		var split_data = data.split("-");
		console.log(split_data);
		if((parseInt(split_data[0]) > 2099 || isNaN(split_data[0])) || 
				(parseInt(split_data[1]) > 12 || isNaN(split_data[1])) || 
				(parseInt(split_data[2]) > 31 || isNaN(split_data[2]))) {
			$('#data_label').text("Insira uma data válida!");
			return false;
		} else {
			$('#data_label').text("");
		}
				
		var split_hora = hora.split(":");
		if((parseInt(split_hora[0]) > 23 || isNaN(parseInt(split_hora[0])) ) || 
				(parseInt(split_hora[1]) > 59 || isNaN(split_hora[1]))) {
			$('#hora_label').text("Insira uma hora válida!");
			return false;
		} else {
			$('#hora_label').text("");
		}
		
		$('#novo_agendamento_data_hora').fadeOut().promise().done(function() {
			$('#finaliza_agendamento').fadeIn();
			$('#loading-finaliza').text("Aguarde um momento, por favor...");
			$.post("salvar-agendamento", {cd_funcionario: funcionario_id, cd_exame: exame, cd_prestador: prestador, dt_agenda_exame: data, dt_agenda_hora: hora})
			.done(function() {
				exame = 0;
				data = "";
				hora = "";
				$('.app').fadeOut().promise().done(function() {
					$('#select_opcao').fadeIn();					
				});
			});
		});
	});
});
