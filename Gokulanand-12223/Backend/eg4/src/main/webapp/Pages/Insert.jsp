<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
</head>

<style>
.button {
  -webkit-appearance: none;
  appearance: none;
  position: relative;
  border-width: 0;
  padding: 0 8px 12px;
  min-width: 10em;
  box-sizing: border-box;
  background: transparent;
  font: inherit;
  cursor: pointer;
}

.button-top {
  display: flex;
  align-items: center;
  justify-content: center;
  position: relative;
  z-index: 0;
  padding: 8px 16px;
  transform: translateY(0);
  text-align: center;
  color: #fff;
  text-shadow: 0 -1px rgba(0, 0, 0, .25);
  transition-property: transform;
  transition-duration: .2s;
  -webkit-user-select: none;
  user-select: none;
}

.button:active .button-top {
  transform: translateY(6px);
}

.button-top::after {
  content: '';
  position: absolute;
  z-index: -1;
  border-radius: 4px;
  width: 100%;
  height: 100%;
  box-sizing: content-box;
  background-image: radial-gradient(#cd3f64, #9d3656);
  text-align: center;
  color: #fff;
  box-shadow: inset 0 0 0px 1px rgba(255, 255, 255, .2), 0 1px 2px 1px rgba(255, 255, 255, .2);
  transition-property: border-radius, padding, width, transform;
  transition-duration: .2s;
}

.button:active .button-top::after {
  border-radius: 6px;
  padding: 0 2px;
}

.button-bottom {
  position: absolute;
  z-index: -1;
  bottom: 4px;
  left: 4px;
  border-radius: 8px / 16px 16px 8px 8px;
  padding-top: 6px;
  width: calc(100% - 8px);
  height: calc(100% - 10px);
  box-sizing: content-box;
  background-color: #803;
  background-image: radial-gradient(4px 8px at 4px calc(100% - 8px), rgba(255, 255, 255, .25), transparent), radial-gradient(4px 8px at calc(100% - 4px) calc(100% - 8px), rgba(255, 255, 255, .25), transparent), radial-gradient(16px at -4px 0, white, transparent), radial-gradient(16px at calc(100% + 4px) 0, white, transparent);
  box-shadow: 0px 2px 3px 0px rgba(0, 0, 0, 0.5), inset 0 -1px 3px 3px rgba(0, 0, 0, .4);
  transition-property: border-radius, padding-top;
  transition-duration: .2s;
}

.button:active .button-bottom {
  border-radius: 10px 10px 8px 8px / 8px;
  padding-top: 0;
}

.button-base {
  position: absolute;
  z-index: -2;
  top: 4px;
  left: 0;
  border-radius: 12px;
  width: 100%;
  height: calc(100% - 4px);
  background-color: rgba(0, 0, 0, .15);
  box-shadow: 0 1px 1px 0 rgba(255, 255, 255, .75), inset 0 2px 2px rgba(0, 0, 0, .25);
}

#label{
border-radius: 10px;
}
</style>

<body>

<div>
  <label for="inputname" class="block text-gray-800 font-semibold text-sm" id="label">Product Name</label>
  <div class="mt-2">
    <input
      type="text"
      name="inputname"
      class="block w-56 rounded-md py-1.5 px-2 ring-1 ring-inset ring-gray-400 focus:text-gray-800"/>
  </div>
</div>

<br>

<div>
  <label for="inputname" class="block text-gray-800 font-semibold text-sm">Product Brand</label>
  <div class="mt-2">
    <input
      type="text"
      name="inputname"
      class="block w-56 rounded-md py-1.5 px-2 ring-1 ring-inset ring-gray-400 focus:text-gray-800"/>
  </div>
</div>

<br>

<div>
  <label for="inputname" class="block text-gray-800 font-semibold text-sm">Quantity</label>
  <div class="mt-2">
    <input
      type="text"
      name="inputname"
      class="block w-56 rounded-md py-1.5 px-2 ring-1 ring-inset ring-gray-400 focus:text-gray-800"/>
  </div>
</div>

<br>

<div>
  <label for="inputname" class="block text-gray-800 font-semibold text-sm">Price</label>
  <div class="mt-2">
    <input
      type="text"
      name="inputname"
      class="block w-56 rounded-md py-1.5 px-2 ring-1 ring-inset ring-gray-400 focus:text-gray-800"/>
  </div>
</div>

<br>

<div>
  <label for="inputname" class="block text-gray-800 font-semibold text-sm">Discount</label>
  <div class="mt-2">
    <input
      type="text"
      name="inputname"
      class="block w-56 rounded-md py-1.5 px-2 ring-1 ring-inset ring-gray-400 focus:text-gray-800"/>
  </div>
</div>

<br>
<br>

<button type="button" class="button">
  <div class="button-top">Insert</div>
  <div class="button-bottom"></div>
  <div class="button-base"></div>
</button>

</body>
</html>