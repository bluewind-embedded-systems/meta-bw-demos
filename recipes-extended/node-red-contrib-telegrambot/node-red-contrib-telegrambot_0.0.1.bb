SUMMARY = "Telegram bot nodes for node-red."
SECTION = "js/devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "all"

SRCREV = "bdefd8f90b558821dc900685a9518c269f7596a7"
SRC_URI = "git://github.com/windkh/node-red-contrib-telegrambot.git"

SRC_URI[md5sum] = "a6ff4cfb352b33657f6cd561555117c4"
SRC_URI[sha256sum] = "07654c5767d30d5ce7cd588a759eabf99befe02979c0681b7f54c56b973584e1"

S = "${WORKDIR}/git"

INSANE_SKIP_${PN} += "file-rdeps"

inherit npm-install-global

BBCLASSEXTEND = "native nativesdk"

RDEPENDS_${PN} += " node-red node-telegram-bot-api"
