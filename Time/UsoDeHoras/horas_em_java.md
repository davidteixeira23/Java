# APRENDENDO A USAR AS HORAS EM JAVA

## Obtendo a hora atual

```java
LocalTime horaAtual = LocalTime.now();
System.out.println("Hora atual " + horaAtual);
```

<p>
Instanciando o <code>LocalTime.now()</code> podemos usar o horario local atual,
e então o console irá imprimir o horario atual da sua maquina.
</p>

---

## Definindo um horário manualmente

```java
LocalTime horaEntrada = LocalTime.of(22, 20, 00);
System.out.println("hora de entrada no serviço é igual a " + horaEntrada);
```

<p>
Com essa instânciação você pode definir as horas manualmente e armazenalas em algum local.
</p>

---

## Somando horas

```java
LocalTime HoraPrimeiraDoseMedicacao = LocalTime.now().plusHours(2);
LocalTime HoraSegundaDoseMedicacao = HoraPrimeiraDoseMedicacao.plusHours(2);
```

<p>
Aqui podemos imaginar um sistema desenvolvido para um medico, com função de avisar
para o profissional quando será a hora do seu paciente de tomar as doses de medicamento.

Instânciamo um <code>LocalTime</code> chamado
<code>HoraPrimeiraDoseMedicacao</code>, logo em seguida dizemos que essa instância
será igual ao tempo atual + 2 horas usando o método <code>plusHours</code>.
Em seguida criamos outra instância que diz que a segunda dose será o tempo da
primeira mais 2 horas.
</p>

---

## Subtraindo horas

```java
LocalTime ReducaoHoras = HoraPrimeiraDoseMedicacao.minusHours(72);
```

<p>
Se temos uma forma de aumentar as horas em relação a um valor já existente
(<code>plusHours</code>), então também podemos calcular o tempo no passado
usando <code>minusHours</code>.
</p>    