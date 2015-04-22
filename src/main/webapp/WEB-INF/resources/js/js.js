/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

{
    var table = document.getElementById('keyboard');
    if (table != null) {
        for (var i = 0; i < table.rows.length; i++) {
            for (var j = 0; j < table.rows[i].cells.length; j++)
                table.rows[i].cells[j].onclick = function () {
                    cardInputFunction(this);
                };
        }
    }

    function cardInputFunction(cellText) {
        var cardInput = document.getElementById('card_input');
        var currentValue = cardInput.value;
        alert(currentValue);
        cardInput.value += currentValue + cellText;
    }
}
