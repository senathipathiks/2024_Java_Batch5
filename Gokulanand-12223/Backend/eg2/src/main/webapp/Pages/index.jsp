<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
.calculator {
  border-radius: 10px;
  box-shadow: 0px 3px 6px 0px rgba(0, 0, 0, 0.15), 0px 2px 4px 0px rgba(0, 0, 0, 0.12);
  margin-inline-start: auto;
  margin-inline-end: auto;
  margin-block-start: 2em;
  max-inline-size: 22rem;
  overflow: hidden;
}
.calculator__output {
  background: hsl(202, 11%, 29%);
  color: hsl(255, 100%, 100%);
  font-size: 2rem;
  padding-block-start: 0.5rem;
  padding-block-end: 0.5rem;
  padding-inline-end: 0.75rem;
  text-align: end;
}
.calculator__keys {
  padding: 0.5rem; /* Add some whitespace around the keys */
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  grid-gap: 1px;
  background: hsl(207, 19%, 61%);
}
.calculator__key {
  background: hsl(210, 25%, 95%);
  border: none;
  font-size: 2rem;
  /* Playful Styles: */
  inline-size: 60px;
  block-size: 60px;
  border-radius: 40px;
  margin: 0.25rem;
}
.calculator__key--enter {
  grid-column: 4 / 5;
  grid-row: 2 / span 4;
  background: hsl(357, 100%, 72%);
  height: auto; /* Allow the key to span the four rows */
}
.calculator__key:active,
.calculator__key:focus {
  box-shadow: 0 0 8px 0 rgba(0, 0, 0, 0.3) inset;
  outline: none;
}
.calculator__key--operator {
  background: hsl(208, 25%, 86%);
}
.calculator__key--operator:active {
  background: hsl(208, 24%, 80%);
}
</style>

<body>
  <div class="calculator">
  <div class="calculator__output">0</div>
  <div class="calculator__keys">
    <button class="calculator__key calculator__key--operator">+</button>
    <button class="calculator__key calculator__key--operator">-</button>
    <button class="calculator__key calculator__key--operator">&times;</button>
    <button class="calculator__key calculator__key--operator">÷</button>
    <button class="calculator__key">7</button>
    <button class="calculator__key">8</button>
    <button class="calculator__key">9</button>
    <button class="calculator__key">4</button>
    <button class="calculator__key">5</button>
    <button class="calculator__key">6</button>
    <button class="calculator__key">1</button>
    <button class="calculator__key">2</button>
    <button class="calculator__key">3</button>
    <button class="calculator__key">0</button>
    <button class="calculator__key">.</button>
    <button class="calculator__key">AC</button>
    <button class="calculator__key calculator__key--enter">=</button>
  </div>
</div>
</body>
</html>