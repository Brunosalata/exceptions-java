# exceptions-java

<h3>Solução 1 (muito ruim)</h3>
<p>Lógica de validação no programa principal</p>
<ul>
<li>Lógica de validação não delegada à reserva</li>
</ul>

<h3>Solução 2 (ruim)</h3>
<p>Método retornando string</p>
<ul>
<li>A semântica da operação é prejudicada</li>
<ul><li>Retornar string não tem nada a ver com atualização de reserva</li>
<li>E se a operação tivesse que retornar string?</li></ul>
<li>Ainda não é possível tratar exceções em construtores</li>
<li>Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houve erro</li>
<li>A lógica fica estruturada em condicionais aninhadas</li>
</ul>

<h3>Solução 3 (boa)</h3>
<p>Tratamento de exceções</p>

<h1>Resumo</h1>
<ul>
<li>Cláusila throws: propaga a exceção ao invés de tratá-la</li>
<li>Cláusula throws: lança a exceção / "corta" o método</li>
<li>Exception: compilador obriga a tratar ou propagar</li>
<li>RuntimeException: compilador não obriga tratamento</li>
<li>O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas</li>
<li>Vantagens</li>
<ul><li>Lógica delegada</li>
<li>Construtores podem ter tratamento de exceções</li>
<li>Possibilidade de auxílio do compilador</li>
<li>Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma exceção for disparada, a exceção é interrompida e cai no bloco catch correspondente</li>
<li>É possível capturar inclusive otras exceções de sistema</li>
</ul>
</ul>
