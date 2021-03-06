PGDMP         1                 y            postgres    13.1    13.1 F               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    13442    postgres    DATABASE     e   CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Mexico.1252';
    DROP DATABASE postgres;
                postgres    false                       0    0    DATABASE postgres    COMMENT     N   COMMENT ON DATABASE postgres IS 'default administrative connection database';
                   postgres    false    3092                        3079    16384 	   adminpack 	   EXTENSION     A   CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;
    DROP EXTENSION adminpack;
                   false                       0    0    EXTENSION adminpack    COMMENT     M   COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';
                        false    2            �            1259    16426    actividades    TABLE     �   CREATE TABLE public.actividades (
    idactividad integer NOT NULL,
    nombre character varying NOT NULL,
    descripcion character varying NOT NULL,
    fechaentrega character varying NOT NULL,
    calificacion character varying NOT NULL
);
    DROP TABLE public.actividades;
       public         heap    postgres    false            �            1259    16424    actividades_idactividad_seq    SEQUENCE     �   CREATE SEQUENCE public.actividades_idactividad_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.actividades_idactividad_seq;
       public          postgres    false    207                       0    0    actividades_idactividad_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.actividades_idactividad_seq OWNED BY public.actividades.idactividad;
          public          postgres    false    206            �            1259    16474    alumno_actividades    TABLE     w   CREATE TABLE public.alumno_actividades (
    matricula character varying NOT NULL,
    idactividad integer NOT NULL
);
 &   DROP TABLE public.alumno_actividades;
       public         heap    postgres    false            �            1259    16416    alumnos    TABLE     �   CREATE TABLE public.alumnos (
    matricula character varying NOT NULL,
    nombre character varying NOT NULL,
    paterno character varying NOT NULL,
    materno character varying NOT NULL
);
    DROP TABLE public.alumnos;
       public         heap    postgres    false            �            1259    16494    examenes    TABLE     �   CREATE TABLE public.examenes (
    idexamen integer NOT NULL,
    fecha character varying NOT NULL,
    nombre character varying NOT NULL,
    idmateria integer NOT NULL
);
    DROP TABLE public.examenes;
       public         heap    postgres    false            �            1259    16492    examenes_idexamen_seq    SEQUENCE     �   CREATE SEQUENCE public.examenes_idexamen_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.examenes_idexamen_seq;
       public          postgres    false    212                       0    0    examenes_idexamen_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.examenes_idexamen_seq OWNED BY public.examenes.idexamen;
          public          postgres    false    211            �            1259    16396    materias    TABLE     h   CREATE TABLE public.materias (
    idmateria integer NOT NULL,
    nombre character varying NOT NULL
);
    DROP TABLE public.materias;
       public         heap    postgres    false            �            1259    16456    materias_alumno    TABLE     r   CREATE TABLE public.materias_alumno (
    matricula character varying NOT NULL,
    idmateria integer NOT NULL
);
 #   DROP TABLE public.materias_alumno;
       public         heap    postgres    false            �            1259    16435    materias_asignadas    TABLE     l   CREATE TABLE public.materias_asignadas (
    idprofesor integer NOT NULL,
    idmateria integer NOT NULL
);
 &   DROP TABLE public.materias_asignadas;
       public         heap    postgres    false            �            1259    16394    materias_id materia_seq    SEQUENCE     �   CREATE SEQUENCE public."materias_id materia_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public."materias_id materia_seq";
       public          postgres    false    202                       0    0    materias_id materia_seq    SEQUENCE OWNED BY     T   ALTER SEQUENCE public."materias_id materia_seq" OWNED BY public.materias.idmateria;
          public          postgres    false    201            �            1259    32780 	   preguntas    TABLE     �   CREATE TABLE public.preguntas (
    idpregunta integer NOT NULL,
    nombre character varying NOT NULL,
    idexamen integer NOT NULL
);
    DROP TABLE public.preguntas;
       public         heap    postgres    false            �            1259    32778    preguntas_idpregunta_seq    SEQUENCE     �   CREATE SEQUENCE public.preguntas_idpregunta_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.preguntas_idpregunta_seq;
       public          postgres    false    214                       0    0    preguntas_idpregunta_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.preguntas_idpregunta_seq OWNED BY public.preguntas.idpregunta;
          public          postgres    false    213            �            1259    16407 
   profesores    TABLE     �   CREATE TABLE public.profesores (
    idprofesor integer NOT NULL,
    nombre character varying NOT NULL,
    paterno character varying NOT NULL,
    materno character varying NOT NULL
);
    DROP TABLE public.profesores;
       public         heap    postgres    false            �            1259    16405    profesores_idprofesor_seq    SEQUENCE     �   CREATE SEQUENCE public.profesores_idprofesor_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.profesores_idprofesor_seq;
       public          postgres    false    204                       0    0    profesores_idprofesor_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.profesores_idprofesor_seq OWNED BY public.profesores.idprofesor;
          public          postgres    false    203            �            1259    32796 
   respuestas    TABLE     �   CREATE TABLE public.respuestas (
    idrespuesta integer NOT NULL,
    nombre character varying NOT NULL,
    idpregunta integer NOT NULL
);
    DROP TABLE public.respuestas;
       public         heap    postgres    false            �            1259    32794    respuestas_idrespuesta_seq    SEQUENCE     �   CREATE SEQUENCE public.respuestas_idrespuesta_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.respuestas_idrespuesta_seq;
       public          postgres    false    216                       0    0    respuestas_idrespuesta_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.respuestas_idrespuesta_seq OWNED BY public.respuestas.idrespuesta;
          public          postgres    false    215            \           2604    16429    actividades idactividad    DEFAULT     �   ALTER TABLE ONLY public.actividades ALTER COLUMN idactividad SET DEFAULT nextval('public.actividades_idactividad_seq'::regclass);
 F   ALTER TABLE public.actividades ALTER COLUMN idactividad DROP DEFAULT;
       public          postgres    false    207    206    207            ]           2604    16497    examenes idexamen    DEFAULT     v   ALTER TABLE ONLY public.examenes ALTER COLUMN idexamen SET DEFAULT nextval('public.examenes_idexamen_seq'::regclass);
 @   ALTER TABLE public.examenes ALTER COLUMN idexamen DROP DEFAULT;
       public          postgres    false    212    211    212            Z           2604    16399    materias idmateria    DEFAULT     {   ALTER TABLE ONLY public.materias ALTER COLUMN idmateria SET DEFAULT nextval('public."materias_id materia_seq"'::regclass);
 A   ALTER TABLE public.materias ALTER COLUMN idmateria DROP DEFAULT;
       public          postgres    false    202    201    202            ^           2604    32783    preguntas idpregunta    DEFAULT     |   ALTER TABLE ONLY public.preguntas ALTER COLUMN idpregunta SET DEFAULT nextval('public.preguntas_idpregunta_seq'::regclass);
 C   ALTER TABLE public.preguntas ALTER COLUMN idpregunta DROP DEFAULT;
       public          postgres    false    214    213    214            [           2604    16410    profesores idprofesor    DEFAULT     ~   ALTER TABLE ONLY public.profesores ALTER COLUMN idprofesor SET DEFAULT nextval('public.profesores_idprofesor_seq'::regclass);
 D   ALTER TABLE public.profesores ALTER COLUMN idprofesor DROP DEFAULT;
       public          postgres    false    203    204    204            _           2604    32799    respuestas idrespuesta    DEFAULT     �   ALTER TABLE ONLY public.respuestas ALTER COLUMN idrespuesta SET DEFAULT nextval('public.respuestas_idrespuesta_seq'::regclass);
 E   ALTER TABLE public.respuestas ALTER COLUMN idrespuesta DROP DEFAULT;
       public          postgres    false    216    215    216                      0    16426    actividades 
   TABLE DATA           c   COPY public.actividades (idactividad, nombre, descripcion, fechaentrega, calificacion) FROM stdin;
    public          postgres    false    207   �Q                 0    16474    alumno_actividades 
   TABLE DATA           D   COPY public.alumno_actividades (matricula, idactividad) FROM stdin;
    public          postgres    false    210   �R                 0    16416    alumnos 
   TABLE DATA           F   COPY public.alumnos (matricula, nombre, paterno, materno) FROM stdin;
    public          postgres    false    205   �R       
          0    16494    examenes 
   TABLE DATA           F   COPY public.examenes (idexamen, fecha, nombre, idmateria) FROM stdin;
    public          postgres    false    212   HS                  0    16396    materias 
   TABLE DATA           5   COPY public.materias (idmateria, nombre) FROM stdin;
    public          postgres    false    202   �S                 0    16456    materias_alumno 
   TABLE DATA           ?   COPY public.materias_alumno (matricula, idmateria) FROM stdin;
    public          postgres    false    209   �U                 0    16435    materias_asignadas 
   TABLE DATA           C   COPY public.materias_asignadas (idprofesor, idmateria) FROM stdin;
    public          postgres    false    208   V                 0    32780 	   preguntas 
   TABLE DATA           A   COPY public.preguntas (idpregunta, nombre, idexamen) FROM stdin;
    public          postgres    false    214   SV                 0    16407 
   profesores 
   TABLE DATA           J   COPY public.profesores (idprofesor, nombre, paterno, materno) FROM stdin;
    public          postgres    false    204   �V                 0    32796 
   respuestas 
   TABLE DATA           E   COPY public.respuestas (idrespuesta, nombre, idpregunta) FROM stdin;
    public          postgres    false    216   2W                  0    0    actividades_idactividad_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.actividades_idactividad_seq', 5, true);
          public          postgres    false    206                       0    0    examenes_idexamen_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.examenes_idexamen_seq', 4, true);
          public          postgres    false    211                       0    0    materias_id materia_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public."materias_id materia_seq"', 41, true);
          public          postgres    false    201                        0    0    preguntas_idpregunta_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.preguntas_idpregunta_seq', 6, true);
          public          postgres    false    213            !           0    0    profesores_idprofesor_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.profesores_idprofesor_seq', 3, true);
          public          postgres    false    203            "           0    0    respuestas_idrespuesta_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.respuestas_idrespuesta_seq', 12, true);
          public          postgres    false    215            g           2606    16434    actividades actividades_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.actividades
    ADD CONSTRAINT actividades_pkey PRIMARY KEY (idactividad);
 F   ALTER TABLE ONLY public.actividades DROP CONSTRAINT actividades_pkey;
       public            postgres    false    207            e           2606    16423    alumnos alumnos_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.alumnos
    ADD CONSTRAINT alumnos_pkey PRIMARY KEY (matricula);
 >   ALTER TABLE ONLY public.alumnos DROP CONSTRAINT alumnos_pkey;
       public            postgres    false    205            o           2606    16502    examenes examenes_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.examenes
    ADD CONSTRAINT examenes_pkey PRIMARY KEY (idexamen);
 @   ALTER TABLE ONLY public.examenes DROP CONSTRAINT examenes_pkey;
       public            postgres    false    212            a           2606    16401    materias materias_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.materias
    ADD CONSTRAINT materias_pkey PRIMARY KEY (idmateria);
 @   ALTER TABLE ONLY public.materias DROP CONSTRAINT materias_pkey;
       public            postgres    false    202            i           2606    16439    materias_asignadas pk_compuesta 
   CONSTRAINT     p   ALTER TABLE ONLY public.materias_asignadas
    ADD CONSTRAINT pk_compuesta PRIMARY KEY (idprofesor, idmateria);
 I   ALTER TABLE ONLY public.materias_asignadas DROP CONSTRAINT pk_compuesta;
       public            postgres    false    208    208            m           2606    16481 1   alumno_actividades pk_compuesta_alumnoactividades 
   CONSTRAINT     �   ALTER TABLE ONLY public.alumno_actividades
    ADD CONSTRAINT pk_compuesta_alumnoactividades PRIMARY KEY (matricula, idactividad);
 [   ALTER TABLE ONLY public.alumno_actividades DROP CONSTRAINT pk_compuesta_alumnoactividades;
       public            postgres    false    210    210            k           2606    16463 +   materias_alumno pk_compuesta_materiasalumno 
   CONSTRAINT     {   ALTER TABLE ONLY public.materias_alumno
    ADD CONSTRAINT pk_compuesta_materiasalumno PRIMARY KEY (matricula, idmateria);
 U   ALTER TABLE ONLY public.materias_alumno DROP CONSTRAINT pk_compuesta_materiasalumno;
       public            postgres    false    209    209            q           2606    32788    preguntas preguntas_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.preguntas
    ADD CONSTRAINT preguntas_pkey PRIMARY KEY (idpregunta);
 B   ALTER TABLE ONLY public.preguntas DROP CONSTRAINT preguntas_pkey;
       public            postgres    false    214            c           2606    16415    profesores profesores_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.profesores
    ADD CONSTRAINT profesores_pkey PRIMARY KEY (idprofesor);
 D   ALTER TABLE ONLY public.profesores DROP CONSTRAINT profesores_pkey;
       public            postgres    false    204            s           2606    32804    respuestas respuestas_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT respuestas_pkey PRIMARY KEY (idrespuesta);
 D   ALTER TABLE ONLY public.respuestas DROP CONSTRAINT respuestas_pkey;
       public            postgres    false    216            v           2606    16464 $   materias_alumno fk_alumnos_matricula    FK CONSTRAINT     �   ALTER TABLE ONLY public.materias_alumno
    ADD CONSTRAINT fk_alumnos_matricula FOREIGN KEY (matricula) REFERENCES public.alumnos(matricula);
 N   ALTER TABLE ONLY public.materias_alumno DROP CONSTRAINT fk_alumnos_matricula;
       public          postgres    false    209    2917    205            z           2606    16503    examenes fk_examenes_idmateria    FK CONSTRAINT     �   ALTER TABLE ONLY public.examenes
    ADD CONSTRAINT fk_examenes_idmateria FOREIGN KEY (idexamen) REFERENCES public.materias(idmateria);
 H   ALTER TABLE ONLY public.examenes DROP CONSTRAINT fk_examenes_idmateria;
       public          postgres    false    212    202    2913            y           2606    16487 !   alumno_actividades fk_idactividad    FK CONSTRAINT     �   ALTER TABLE ONLY public.alumno_actividades
    ADD CONSTRAINT fk_idactividad FOREIGN KEY (idactividad) REFERENCES public.actividades(idactividad);
 K   ALTER TABLE ONLY public.alumno_actividades DROP CONSTRAINT fk_idactividad;
       public          postgres    false    2919    210    207            u           2606    16445    materias_asignadas fk_idmateria    FK CONSTRAINT     �   ALTER TABLE ONLY public.materias_asignadas
    ADD CONSTRAINT fk_idmateria FOREIGN KEY (idmateria) REFERENCES public.materias(idmateria);
 I   ALTER TABLE ONLY public.materias_asignadas DROP CONSTRAINT fk_idmateria;
       public          postgres    false    202    2913    208            t           2606    16440     materias_asignadas fk_idprofesor    FK CONSTRAINT     �   ALTER TABLE ONLY public.materias_asignadas
    ADD CONSTRAINT fk_idprofesor FOREIGN KEY (idprofesor) REFERENCES public.profesores(idprofesor);
 J   ALTER TABLE ONLY public.materias_asignadas DROP CONSTRAINT fk_idprofesor;
       public          postgres    false    2915    204    208            w           2606    16469 %   materias_alumno fk_materias_idmateria    FK CONSTRAINT     �   ALTER TABLE ONLY public.materias_alumno
    ADD CONSTRAINT fk_materias_idmateria FOREIGN KEY (idmateria) REFERENCES public.materias(idmateria);
 O   ALTER TABLE ONLY public.materias_alumno DROP CONSTRAINT fk_materias_idmateria;
       public          postgres    false    2913    209    202            x           2606    16482    alumno_actividades fk_matricula    FK CONSTRAINT     �   ALTER TABLE ONLY public.alumno_actividades
    ADD CONSTRAINT fk_matricula FOREIGN KEY (matricula) REFERENCES public.alumnos(matricula);
 I   ALTER TABLE ONLY public.alumno_actividades DROP CONSTRAINT fk_matricula;
       public          postgres    false    210    2917    205            {           2606    32789 !   preguntas preguntas_idexamen_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.preguntas
    ADD CONSTRAINT preguntas_idexamen_fkey FOREIGN KEY (idexamen) REFERENCES public.examenes(idexamen);
 K   ALTER TABLE ONLY public.preguntas DROP CONSTRAINT preguntas_idexamen_fkey;
       public          postgres    false    2927    212    214            |           2606    32805 %   respuestas respuestas_idpregunta_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.respuestas
    ADD CONSTRAINT respuestas_idpregunta_fkey FOREIGN KEY (idpregunta) REFERENCES public.preguntas(idpregunta);
 O   ALTER TABLE ONLY public.respuestas DROP CONSTRAINT respuestas_idpregunta_fkey;
       public          postgres    false    2929    216    214               �   x�]�A��0E��)|�i��0܅�I�bd��IX���� �H��g���d�P9 ���P1J(��� �s��=s~��G?��uF�f�ML ��W�`H���sPioعa<<����d���{gH7~�oݮ�E���o�3;��'��)�� <��1p��P?�s���;�"d^W4�T*/��5.\jR��
y!�Ǘ���Z� 3&iC         B   x�U͹�0C���E��#�0�+]X>|�ks�1}�?9�[i�ȯ�ֶF��(e�ry(Q�< .0C�         _   x�-���  ��_0VQ��FHD�_o�[�r��y^�ŀ�|d�zfp�+��@+ZV����81�|�Ɉ�J���ʩ�
�k�R"~�0      
   @   x�3��7�7202�,(*MMJ�4�2�44�	�V$��)�I��	�LJjA~QIfY>P:F��� .{             x�}Tّ�0�&�`���K~ �p�ǆ�7.+5�� �ֲ��|x���;����2��v�e/�[�2������@A�� PC����(\�9���KQ���s�pDE�����B8Eg�P��M��<?���H�ˆ���?�\�2?���[����;�m��򪍾R6.U�uOw�5eV���b��#?��7g��U�r+2G��+��\�K1UL09�ّ�F�Tl�xk.9	�O_�D5l��JH�;s��tmyi`���	
��D;�F�3:��V���S��̼
�ɷ��j[߉y����0�aԽ�w74:3n��'܏����n�g��1�ܹ�(��%=��K��a�h���-ɠ)���{8��" ͊O�VOL�L�*<F��p�����@f�l,�5��6t�F����:_��2
�4?g�ƃ�h��a1e~%�u<ZW�Zv��e�<m&��e7-�:�s2�E�=gC2�ꅞ��ϋ�nQ�u��jß49���4�/On<���c',;A7�����|�&�����         @   x�Uʱ 1���l\���ÄO�sǭf�L/	�R�B����.��G[K�}��� b�         +   x�3�44�2�4bs.#NC a�e�ih"L���W� s�_         r   x��A�0��u�s���E،�b0�ښ^����ܼ��'�q߽�I9�c�IRp]O-2gM,�f�G��7o�U�4�����n��{I2Hp�Z#᥀�������Sw!�K})%         M   x��A
�0D���0B�:n�����Oo���W$O�a�E8�i���;���͌��`45�Ϊ�9��e_D�4^&         W   x��9�0���0grRDʂ)�=��7�X��3�$�Maa<9ؠY�m�M��O<�??�Q�c!fH�w:Dg����w     