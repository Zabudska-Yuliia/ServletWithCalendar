<html>
<head>
    <title>Project</title>
    <style>
        input[type=text] {padding:10px; margin:5px;}
        body{ font-family: Roboto; color: #363636;}
        input[type=submit]{border-radius:5px; background-color:#009999; padding:10px; margin:5px;}
        select{padding: 5px; margin: 7px; border-radius: 2px; color:#009999;}
    </style>
</head>
<body>
<h1>Make your choice</h1>
<h2>Calendar</h2>
${dateM}
<form action="/calendar" method="get">
    <select name="year">
        <option value="2016">2016</option>
        <option value="2015">2015</option>
        <option value="2014">2014</option>
        <option value="2013">2013</option>
        <option value="2012">2012</option>
        <option value="2011">2011</option>
        <option value="2010">2010</option>
        <option value="2009">2009</option>
        <option value="2008">2008</option>
        <option value="2007">2007</option>
        <option value="2006">2006</option>
        <option value="2005">2005</option>
        <option value="2004">2004</option>
        <option value="2003">2003</option>
        <option value="2002">2002</option>
        <option value="2001">2001</option>
        <option value="2000">2000</option>
    </select>
    <select name="month">
        <option value="12">12</option>
        <option value="11">11</option>
        <option value="10">10</option>
        <option value="9">9</option>
        <option value="8">8</option>
        <option value="7">7</option>
        <option value="6">6</option>
        <option value="5">5</option>
        <option value="4">4</option>
        <option value="3">3</option>
        <option value="2">2</option>
        <option value="1">1</option>
    </select>
    <!--<input type="text" name="date" placeholder="2016-04-12"/>-->
<input type="submit" value="Show me!"/>
</form>
<hr>
<h2>Greeter</h2>
<form action="/greeter">
    <input type="text" name="name" placeholder="username"/>
    <input type="submit" class="button" value="Greate me - >"></form>
</body>
</html>
