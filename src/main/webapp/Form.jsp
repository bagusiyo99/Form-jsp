<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Data</title>
    <script>
        function validateForm() {
            var name = document.getElementById("name").value;
            var gender = document.querySelector('input[name="gender"]:checked');
            var address = document.getElementById("address").value;
            var wa = document.getElementById("wa").value;
            var province = document.getElementById("province").value;
            var languageChecked = document.querySelectorAll('input[name="language"]:checked');

            if (name === "") {
                alert("Nama harus diisi");
                return false;
            }

            if (gender === null) {
                alert("Jenis kelamin harus dipilih");
                return false;
            }

            if (address === "") {
                alert("Alamat harus diisi");
                return false;
            }

            if (wa === "") {
                alert("Nomor WhatsApp harus diisi");
                return false;
            }

            if (province === "") {
                alert("Provinsi harus dipilih");
                return false;
            }

            if (languageChecked.length === 0) {
                alert("Minimal satu bahasa harus dipilih");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
    <h2>Form Data</h2>
    <form action="<%= request.getContextPath() %>/Controller" method="post" onsubmit="return validateForm()">
        <label for="name">Nama:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label>Jenis Kelamin:</label><br>
        <input type="radio" id="male" name="gender" value="male" checked>
        <label for="male">Laki-laki</label><br>
        <input type="radio" id="female" name="gender" value="female">
        <label for="female">Perempuan</label><br><br>
        
        <label for="address">Alamat:</label>
        <input type="text" id="address" name="address" required><br><br>
        
        <label for="wa">Nomor WhatsApp:</label>
        <input type="text" id="wa" name="wa" required><br><br>
        
        <label for="message">Pesan:</label><br>
        <textarea id="message" name="message" rows="4" cols="50"></textarea><br><br>
        
      <label for="province">Provinsi:</label>
        <select id="province" name="province">
            <option value="Aceh">Aceh</option>
            <option value="Bali">Bali</option>
            <option value="Bangka Belitung">Bangka Belitung</option>
            <option value="Banten">Banten</option>
            <option value="Bengkulu">Bengkulu</option>
            <option value="Gorontalo">Gorontalo</option>
            <option value="DKI Jakarta">DKI Jakarta</option>
            <option value="Jambi">Jambi</option>
            <option value="Jawa Barat">Jawa Barat</option>
            <option value="Jawa Tengah">Jawa Tengah</option>
            <option value="Jawa Timur">Jawa Timur</option>
            <option value="Kalimantan Barat">Kalimantan Barat</option>
            <option value="Kalimantan Selatan">Kalimantan Selatan</option>
            <option value="Kalimantan Tengah">Kalimantan Tengah</option>
            <option value="Kalimantan Timur">Kalimantan Timur</option>
            <option value="Kalimantan Utara">Kalimantan Utara</option>
            <option value="Kepulauan Riau">Kepulauan Riau</option>
            <option value="Lampung">Lampung</option>
            <option value="Maluku">Maluku</option>
            <option value="Maluku Utara">Maluku Utara</option>
            <option value="Nusa Tenggara Barat">Nusa Tenggara Barat</option>
            <option value="Nusa Tenggara Timur">Nusa Tenggara Timur</option>
            <option value="Papua">Papua</option>
            <option value="Papua Barat">Papua Barat</option>
            <option value="Riau">Riau</option>
            <option value="Sulawesi Barat">Sulawesi Barat</option>
            <option value="Sulawesi Selatan">Sulawesi Selatan</option>
            <option value="Sulawesi Tengah">Sulawesi Tengah</option>
            <option value="Sulawesi Tenggara">Sulawesi Tenggara</option>
            <option value="Sulawesi Utara">Sulawesi Utara</option>
            <option value="Sumatera Barat">Sumatera Barat</option>
            <option value="Sumatera Selatan">Sumatera Selatan</option>
            <option value="Sumatera Utara">Sumatera Utara</option>
            <option value="Yogyakarta">Yogyakarta</option>
        </select><br><br>
        
        
        <label>Bahasa yang dikuasai:</label><br>
        <input type="checkbox" id="english" name="language" value="English">
        <label for="english">Inggris</label><br>
        <input type="checkbox" id="indonesian" name="language" value="Indonesian">
        <label for="indonesian">Indonesia</label><br>
        <input type="checkbox" id="usa" name="language" value="USA">
        <label for="usa">USA</label><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
