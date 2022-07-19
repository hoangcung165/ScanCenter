CREATE TABLE  role(
                      role_id INTEGER PRIMARY KEY,
                      role varchar(20) not null,
                      description varchar(150)
);

CREATE TABLE users(
                      user_id BIGSERIAL PRIMARY KEY,
                      role_id integer not null,
                      username varchar(200) not null,
                      password varchar (200)not null,
                      first_name varchar (20) not null,
                      middle_name varchar (20),
                      last_name varchar (20) not null,
                      email varchar (150) not null unique,
                      status_id bigint not null,
                      CONSTRAINT fk_user_role FOREIGN KEY(role_id) REFERENCES role(role_id)
);

--  jdbc token store oauth --
create table oauth_client_details (
                                      client_id varchar(256) primary key,
                                      resource_ids varchar(256),
                                      client_secret varchar(256),
                                      scope varchar(256),
                                      authorized_grant_types varchar(256),
                                      web_server_redirect_uri varchar(256),
                                      authorities varchar(256),
                                      access_token_validity integer,
                                      refresh_token_validity integer,
                                      additional_information varchar(4096),
                                      autoapprove varchar(256)
);
create table oauth_access_token (
                                    token_id VARCHAR(256),
                                    token BYTEA,
                                    authentication_id VARCHAR(256) PRIMARY KEY,
                                    user_name VARCHAR(256),
                                    client_id VARCHAR(256),
                                    authentication BYTEA,
                                    refresh_token VARCHAR(256)
);
create table oauth_refresh_token (
                                     token_id VARCHAR(256),
                                     token BYTEA,
                                     authentication BYTEA
);