<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Jawaban UTS - Pemrograman Web</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
  <link rel="stylesheet" href="style.css">
</head>

<body>
  <div class="container border my-3">
    <div class="row border" id="layer-atas">
      <div class="content mb-4">
        <!-- Table Nama -->
        <table class="table center mx-auto my-3 text-center" id="table-nama">
          <thead>
            <tr>
              <th colspan="2">Jawaban UTS</th>
            </tr>
            <tr>
              <th width="30%">NIM</th>
              <th>NAMA</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>2112510199</td>
              <td>Samuel Hotman Hasiholan Lekatompessy</td>
            </tr>
          </tbody>
        </table>

        <!-- Nav Atas -->
        <div class="text-center border-top border-bottom py-2" id="nav-atas">
          <a href="/uts-pw">HOME</a>
        </div>
      </div>
    </div>
    <div class="row border" id="layer-bawah">
      <div class="col-md-9" id="layer-kiri">
        <div class="content border py-3 px-3" id="konten-kiri">
          <?php
          switch (@$_GET['page']) {
            case 'fti':
              echo '<h1>Fakultas Teknologi Informasi</h1>';
              break;
            case 'fe':
              echo '<h1>Fakultas Ekonomi</h1>';
              break;
            case 'fik':
              echo '<h1>Fakultas Ilmu Komunikasi</h1>';
              break;
            case 'fisip':
              echo '<h1>Fakultas Ilmu Sosial dan Ilmu Politik</h1>';
              break;
            case 'ft':
              echo '<h1>Fakultas Teknik</h1>';
              break;
            default:
              echo '<h1>Home</h1>';
              break;
          }
          ?>
          <img src="https://www.w3schools.com/html/img_chania.jpg" alt="Flowers in Chania" width="230" height="170">
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
        </div>
      </div>
      <div class="col-md-3" id="layer-kanan">
        <div class="content border" id="konten-kanan">
          <ul class="pe-2 py-3">
            <li>
              <div class="text-center border" id="daftar-kanan">
                <a href="?page=fti" class="text-decoration-none">Fakultas Teknologi Informasi</a>
              </div>
            </li>
            <li>
              <div class="text-center border" id="daftar-kanan">
                <a href="?page=fe" class="text-decoration-none">Fakultas Ekonomi</a>
              </div>
            </li>
            <li>
              <div class="text-center border" id="daftar-kanan">
                <a href="?page=fik" class="text-decoration-none">Fakultas Ilmu Komunikasi</a>
              </div>
            </li>
            <li>
              <div class="text-center border" id="daftar-kanan">
                <a href="?page=fisip" class="text-decoration-none">Fakultas Ilmu Sosial dan Ilmu Politik</a>
              </div>
            </li>
            <li>
              <div class="text-center border" id="daftar-kanan">
                <a href="?page=ft" class="text-decoration-none">Fakultas Teknik</a>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>

  <!-- JavaScript Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>

</html>