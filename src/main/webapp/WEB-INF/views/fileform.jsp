<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>uplaod image</title>
  </head>
  <body>
    <div class="container">
      <h1>uplaod image form</h1>
      <form action="uploadimage" method="post" enctype="multipart/form-data">
        <div class="mb-3">
          <label for="formFile" class="form-label">Select your Image</label>
          <input
            class="form-control"
            type="file"
            id="formFile"
            name="profile"
          />
        </div>

        <div class="container text-center">
          <button class="btn btn-outline-primary" type="submit">Upload</button>
        </div>
      </form>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
