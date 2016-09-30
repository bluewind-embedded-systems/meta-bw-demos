FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "file://nodered"

do_install_append () {
    install -d ${D}/etc/init.d/
    install -m 0755 ${WORKDIR}/nodered ${D}/etc/init.d/nodered
    install -d ${D}/etc/rcS.d/
    install -m 0755 ${WORKDIR}/nodered ${D}/etc/rcS.d/S60nodered
}

