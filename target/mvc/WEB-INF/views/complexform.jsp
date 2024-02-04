<%@page isELIgnored="false"%> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
      integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
      crossorigin="anonymous"
    />

    <title>Hello, world!</title>
  </head>
  <body>
    <div class="container mt-4">
      <div class="row">
        <div class="col-md-6 offset-md-3">
          <div class="card">
            <div class="card-body">
              <h3 class="text-center">complex form</h3>
              <div class="alert alert-danger" role="alert">
                A simple danger alert—check it out!
                <form:errors path="student.*" />
              </div>

              <form action="handleform" method="post">
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label"
                    >your id</label
                  >
                  <input
                    type="text"
                    class="form-control"
                    id="id"
                    placeholder="enter id"
                    name="id"
                  />
                </div>

                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label"
                    >your name</label
                  >
                  <input
                    type="text"
                    class="form-control"
                    id="name"
                    placeholder="enter name"
                    name="name"
                  />
                </div>

                <div class="mb-3">
                  <label for="dob" class="form-label">DOB</label>
                  <input
                    type="date"
                    class="form-control"
                    id="dob"
                    name="dob"
                    placeholder="dd/MM/yyyy"
                  />
                </div>

                <div class="mb-3">
                  <label for="courses" class="form-label">courses</label>
                  <select
                    class="form-select"
                    id="courses"
                    name="courses"
                    aria-label="Default select example"
                    multiple
                  >
                    <option selected>---courses---</option>
                    <option value="java">java</option>
                    <option value="python">python</option>
                    <option value="c++">c++</option>
                  </select>
                </div>

                <div class="form-check form-check-inline mb-3">
                  <span>select gender :</span>
                  <input
                    class="form-check-input"
                    type="radio"
                    name="gender"
                    id="inlineRadio1"
                    value="male"
                  />
                  <label class="form-check-label" for="inlineRadio1"
                    >male</label
                  >
                </div>
                <div class="form-check form-check-inline">
                  <input
                    class="form-check-input"
                    type="radio"
                    name="gender"
                    id="inlineRadio2"
                    value="female"
                  />
                  <label class="form-check-label" for="inlineRadio2"
                    >female</label
                  >
                </div>

                <div class="mb-3">
                  <label for="courses" class="form-label">courses</label>
                  <select
                    class="form-select"
                    id="type"
                    name="type"
                    aria-label="Default select example"
                  >
                    <option selected>---type---</option>
                    <option value="oldstudent">oldstudent</option>
                    <option value="normalstudent">normalstudent</option>
                  </select>
                </div>

                <div class="card">
                  <div class="card-body">
                    <p>your address</p>
                    <div class="mb-3">
                      <input
                        type="text"
                        class="form-control"
                        placeholder="enter street"
                        name="address.street"
                      />
                    </div>
                    <div class="mb-3">
                      <input
                        type="text"
                        class="form-control"
                        placeholder="enter city"
                        name="address.city"
                      />
                    </div>
                  </div>
                </div>

                <div class="container text-center">
                  <button type="submit" class="btn btn-primary">Submit</button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script
      src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
      integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
      integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"
      integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
