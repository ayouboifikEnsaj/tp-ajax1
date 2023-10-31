<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="images/Logo_Ensaj.png" alt="Logo" class="logo">
        </a>
    </div>
</div>
<div class="header">
    <div class="container">
        <div class="row">
            <div class="col-12 col-md-6">
                <span id="horloge" style="font-family: Courier New; text-align: center; width:100%;"></span>
            </div>
        </div>
    </div>
</div>
<script src="script/horloge.js" type="text/javascript"></script>
<script>
    function updateClock() {
        const now = new Date();
        const hours = now.getHours().toString().padStart(2, '0');
        const minutes = now.getMinutes().toString().padStart(2, '0');
        const seconds = now.getSeconds().toString().padStart(2, '0');
        document.getElementById('horloge').textContent = `${hours}:${minutes}:${seconds}`;
    }

    setInterval(updateClock, 1000);
    updateClock(); // Initialize the clock immediately
</script>
